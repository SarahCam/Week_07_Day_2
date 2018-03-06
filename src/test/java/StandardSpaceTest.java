import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StandardSpaceTest {

    private StandardSpace standardSpace;
    private Car standardCar;

    @Before
    public void setUp() throws Exception {
        standardSpace = new StandardSpace(1);
        standardCar = new Car("SR55 ABC", Type.STANDARD);
    }

    @Test
    public void canGetCarRegistrationNumber() {
        assertEquals(1, standardSpace.getNumber());
    }

    @Test
    public void canGetParkingSpaceType() {
        assertEquals(Type.STANDARD, standardSpace.getType());
    }

    @Test
    public void canGetCarWhichIsParkedInParkingSpace___getCar_returns_null_whenSpaceIsEmpty() {
        assertEquals(null, standardSpace.getCar());
    }

    @Test
    public void canParkCarInParkingSpace___getCar_returns_CarInstance_whenSpaceIsFull() {
        standardSpace.park(standardCar);
        assertEquals(standardCar, standardSpace.getCar());
    }

    //    @Test
//    public void canCheckIsEmpty() {
//        assertEquals(true, standardSpace.isEmpty());
//    }
}

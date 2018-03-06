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
    public void canGetNumber() {
        assertEquals(1, standardSpace.getNumber());
    }

    @Test
    public void canGetType() {
        assertEquals(Type.STANDARD, standardSpace.getType());
    }

    @Test
    public void canGetCar___Returns_null_whenSpaceIsEmpty() {
        assertEquals(null, standardSpace.getCar());
    }

    //    @Test
//    public void canParkCarInSpace() {
//        standardSpace.park(standardCar);
//        assertEquals(standardCar, standardSpace.getCar());
//    }

    //    @Test
//    public void canCheckIsEmpty() {
//        assertEquals(true, standardSpace.isEmpty());
//    }
}

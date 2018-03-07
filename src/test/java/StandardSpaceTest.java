import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StandardSpaceTest {

    private StandardSpace standardSpace;
    private Car standardCar;

    @Before
    public void setUp() throws Exception {
        standardSpace = new StandardSpace(1, Type.STANDARD);
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
    public void canGetCarParkedInParkingSpace___NULL_WHEN_SPACE_EMPTY() {
        assertEquals(null, standardSpace.getCar());
    }

    @Test
    public void canParkCarInParkingSpace() {
        int time = 1000;                        // For simplicity, time is an int where each digit reps HHMM
        standardSpace.park(standardCar, time);
        assertEquals(standardCar, standardSpace.getCar());
        assertEquals(time, standardSpace.getParkTime());
    }

    @Test
    public void canCheckParkingSpaceIsEmpty___EMPTY() {
        assertEquals(true, standardSpace.isEmpty());
    }

    @Test
    public void canSendFineLetterIfCarParkedInStandardSpaceMoreThanTwoHours() {
        assertEquals("FINE LETTER! Exceeded maximum free parking allowance of: 2 hours for standard customers", standardSpace.standardFine());
    }
}

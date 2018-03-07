import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CarParkTest {

    private ArrayList<Space> spaces;
    private Car car1, car2, car3;
    private Space space1, space2, space3, space4, space5, space6;
    private CarPark carPark;

    @Before
    public void setUp() throws Exception {
        spaces = new ArrayList<>();

        // Create 2 empty disabled parking spaces in the car park, numbered 1 and 2:
        space1 = new DisabledSpace(1, Type.DISABLED);
        space2 = new DisabledSpace(2, Type.DISABLED);
        spaces.add(space1);
        spaces.add(space2);

        // Create 2 empty family parking spaces in the car park, numbered 3 and 4:
        space3 = new FamilySpace(3, Type.FAMILY);
        space4 = new FamilySpace(4, Type.FAMILY);
        spaces.add(space3);
        spaces.add(space4);

        // Create 2 empty standard parking spaces in the car park, numbered 5 and 6:
        space5 = new StandardSpace(5, Type.STANDARD);
        space6 = new StandardSpace(6, Type.STANDARD);
        spaces.add(space5);
        spaces.add(space6);

        // Create 3 cars:
        car1 = new Car("AB06 XYZ", Type.STANDARD);
        car2 = new Car("SW55 ABC", Type.FAMILY);
        car3 = new Car("RB04 CCC", Type.DISABLED);

        // Create the empty car park:
        carPark = new CarPark("Grove Street Car Park", spaces);
    }

    @Test
    public void canParkCar() {
        assertEquals(null, carPark.getCar(space6));
        carPark.park(car1, space6, 1130);
        assertEquals(car1, carPark.getCar(space6));
        assertEquals(1130, carPark.getParkTime(space6));
    }

    @Test
    public void canSoundAlarmIfWrongCarTypeInSpace() {
        carPark.park(car2, space1, 1400);
        assertEquals(Type.FAMILY, car2.getType());
        assertEquals(Type.DISABLED, space1.getType());
        assertEquals("ALARM BELL! Please move your car, you have no disabled sticker", carPark.alarm(car2, space1));
    }

    @Test
    public void canSendFineLetterIfBreachMaxFreeStayLimit() {
        carPark.park(car2, space4, 1400);
        int currentTime = 1800;
        assertEquals("FINE LETTER! Exceeded maximum free parking allowance of: 3 hours for families", carPark.fine(space4, currentTime));
    }
}

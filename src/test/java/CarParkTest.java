import org.junit.Before;

import java.util.ArrayList;

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


}

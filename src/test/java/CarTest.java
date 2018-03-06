import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car standardCar;

    @Before
    public void setUp() throws Exception {
        standardCar = new Car("AH65 ZZZ", Type.STANDARD);
    }

    @Test
    public void canGetRegistration() {
        assertEquals("AH65 ZZZ", standardCar.getRegistration());
    }
}

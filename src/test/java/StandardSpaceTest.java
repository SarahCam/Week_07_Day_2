import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StandardSpaceTest {

    private StandardSpace standardSpace;

    @Before
    public void setUp() throws Exception {
        standardSpace = new StandardSpace(1);
    }

    @Test
    public void canGetNumber() {
        assertEquals(1, standardSpace.getNumber());
    }
}

import org.junit.Before;

public class DisabledSpaceTest {

    private DisabledSpace disabledSpace;

    @Before
    public void setUp() throws Exception {
        disabledSpace = new DisabledSpace(5, Type.DISABLED);
    }
}

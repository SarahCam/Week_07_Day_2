import org.junit.Before;

public class FamilySpaceTest {

    private FamilySpace familySpace;

    @Before
    public void setUp() throws Exception {
        familySpace = new FamilySpace(3, Type.FAMILY);
    }
}

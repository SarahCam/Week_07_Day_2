import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilySpaceTest {

    private FamilySpace familySpace;

    @Before
    public void setUp() throws Exception {
        familySpace = new FamilySpace(3, Type.FAMILY);
    }

    @Test
    public void canTriggerAlarmIfParkedCarDoesNotHaveYoungChildren() {
        assertEquals("ALARM BELL! Please move your car, you have no young children", familySpace.alarm());
    }

    @Test
    public void canSendFineLetterIfCarParkedInFamilySpaceMoreThanThreeHours() {
        assertEquals("FINE LETTER! Exceeded maximum free parking allowance of: 3 hours for families", familySpace.familyFine());
    }
}

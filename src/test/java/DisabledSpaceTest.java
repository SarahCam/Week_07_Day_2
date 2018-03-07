import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DisabledSpaceTest {

    private DisabledSpace disabledSpace;

    @Before
    public void setUp() throws Exception {
        disabledSpace = new DisabledSpace(5, Type.DISABLED);
    }

    @Test
    public void canTriggerAlarmIfParkedCarDoesNotHaveDisabledSticker() {
        assertEquals("ALARM BELL! Please move your car, you have no disabled sticker", disabledSpace.alarm());
    }

    @Test
    public void canSendFineLetterIfCarParkedInDisabledSpaceMoreThanThreeHours() {
        assertEquals("FINE LETTER! Exceeded maximum free parking allowance of: 4 hours for disabled people", disabledSpace.disabledFine());
    }
}

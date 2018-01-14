import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;

    @Before
    public void before() {
        conferenceRoom1 = new ConferenceRoom(28, false, "Executive Suite");
        conferenceRoom2 = new ConferenceRoom(32, false, "Meeting Room B");
    }

    @Test
    public void roomHasCapacity() {
        assertEquals(28, conferenceRoom1.getCapacity());
    }

    @Test
    public void roomIsChargeable() {
        assertEquals(false, conferenceRoom1.isChargeable());
    }

    @Test
    public void roomHasName() {
        assertEquals("Meeting Room B", conferenceRoom2.getName());
    }






}

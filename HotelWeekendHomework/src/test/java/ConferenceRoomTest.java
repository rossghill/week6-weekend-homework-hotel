import RoomTypes.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;

    @Before
    public void before() {
        conferenceRoom1 = new ConferenceRoom(28, "Charlie, Frank, Dee", false, "Executive Suite");
        conferenceRoom2 = new ConferenceRoom(32, "Dennis, Mac", false, "Meeting Room B");
    }

    @Test
    public void roomHasGuests() {
        assertEquals("Charlie, Frank, Dee", conferenceRoom1.getGuests());
    }

    @Test
    public void roomHasName() {
        assertEquals("Meeting Room B", conferenceRoom2.getName());
    }

}

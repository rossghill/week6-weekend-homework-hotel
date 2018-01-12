import Room.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void before() {
        room = new Room(4, "Jim, Steve");
    }

    @Test
    public void roomHasCapacity() {
        assertEquals(4, room.getCapacity());
    }

    @Test
    public void roomHasGuests() {
        assertEquals("Jim, Steve", room.getGuests());
    }

//    @Test
//    public void roomHasType() {
//        assertEquals(   , room.getRoomType());
//    }
}

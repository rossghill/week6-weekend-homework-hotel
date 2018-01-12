import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void before() {
        room = new Room(4, );
    }

    @Test
    public void roomHasCapacity() {
        assertEquals(4, room.getCapacity());
    }

    @Test
    public void roomIsEmpty() {
        assertEquals(0, room.countGuests());
    }

//    @Test
//    public void roomHasType() {
//        assertEquals(   , room.getRoomType());
//    }
}

import RoomTypes.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningroom;

    @Before
    public void before() {
        diningroom = new DiningRoom(56, "James, Charles, Cuthbert");
    }

    @Test
    public void diningRoomHasCapacity() {
        assertEquals(56, diningroom.getCapacity());
    }

    @Test
    public void diningRoomHasGuests() {
        assertEquals("James, Charles, Cuthbert", diningroom.getGuests());
    }
}

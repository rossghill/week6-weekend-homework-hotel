import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guestsInRoom;

    @Before
    public void before() {
        ArrayList<Guest> guestsInRoom = new ArrayList<>();
        guestsInRoom.add(new Guest("Charlie Kelly"));
        room = new Room(4);
    }

    @Test
    public void roomIsEmpty() {
        assertEquals(0, room.countGuests());
    }

    @Test
    public void roomHasCapacity() {
        assertEquals(4, room.getCapacity());
    }

    @Test
    public void canCheckInNewGuest() {
        Guest charlie = new Guest("Charlie Kelly");
        room.checkIn(charlie);
        assertEquals(1, room.countGuests());
    }

//    @Test
//    public void roomHasType() {
//        assertEquals(   , room.getRoomType());
//    }
}

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guestsInRoom;
    Guest guest1;

    @Before
    public void before() {
        ArrayList<Guest> guestsInRoom = new ArrayList<>();
        guestsInRoom.add(new Guest("Charlie Kelly"));
        room = new Room(4);
        Guest guest1 = new Guest("Charlie Kelly");
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
        room.checkIn(guest1);
        assertEquals(1, room.countGuests());
    }

    @Test
    public void canCheckOutGuest() {
        room.checkIn(guest1);
        room.checkOut(guest1);
        assertEquals(0, room.countGuests());
    }

    @Test
    public void addingGuestReducesCapacity() {
        room.checkIn(guest1);
        assertEquals(3, room.getCapacity());
    }

}

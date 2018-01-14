import java.util.ArrayList;

public class Room {

    protected int capacity;
    protected ArrayList<Guest> guestsInRoom;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guestsInRoom = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int countGuests() {
        return this.guestsInRoom.size();
    }

    public void checkIn(Guest guests) {
        guestsInRoom.add(guests);
        capacity = this.capacity - guestsInRoom.size();
    }

}

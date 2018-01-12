import java.util.ArrayList;

public class Room {

    protected int capacity;
    protected ArrayList<Guest> guests;
//    enum roomType;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
//      this.roomType = roomType;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int countGuests() {
        return this.guests.size();
    }

//    public long getRoomType() {
//        return roomType;
//    }

}

package Room;

import java.util.ArrayList;

public class Room {

    protected int capacity;
//    protected String guests;
    protected ArrayList<Guest>  guests;

//    enum roomType;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
//        this.roomType = roomType;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getGuests() {
        return this.guests;
    }

//    public long getRoomType() {
//        return roomType;
//    }

}

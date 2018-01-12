package Room;

public class Room {

    protected int capacity;
    protected String guests;

//    enum roomType;

    public Room(int capacity, String guests) {
        this.capacity = capacity;
        this.guests = guests;
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

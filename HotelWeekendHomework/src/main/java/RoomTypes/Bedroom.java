package RoomTypes;

import Room.Room;


public class Bedroom extends Room {

    protected boolean chargeable;
    protected int roomNumber;

    public Bedroom(int capacity, String guests, boolean chargeable, int roomNumber){
        super(capacity, guests);
        this.chargeable = chargeable;
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public boolean isChargeable() {
        return chargeable;
    }
}

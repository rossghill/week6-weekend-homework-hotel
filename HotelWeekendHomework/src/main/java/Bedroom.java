import java.util.ArrayList;

public class Bedroom extends Room {

    protected boolean chargeable;
    protected int roomNumber;
    protected RoomType roomType;


    public Bedroom(int capacity, boolean chargeable, int roomNumber, RoomType roomType){
        super(capacity);
        this.chargeable = chargeable;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public boolean isChargeable() {
        return chargeable;
    }

    public RoomType getRoomType() {
        return roomType;
    }
}

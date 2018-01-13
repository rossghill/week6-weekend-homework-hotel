import java.util.ArrayList;

public class Bedroom extends Room {

    protected boolean chargeable;
    protected int roomNumber;

    public Bedroom(int capacity, boolean chargeable, int roomNumber){
        super(capacity);
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

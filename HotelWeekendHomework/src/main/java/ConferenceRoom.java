import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private boolean chargeable;
    private String name;

    public ConferenceRoom(int capacity, boolean chargeable, String name) {
        super(capacity);
        this.chargeable = chargeable;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isChargeable() {
        return chargeable;
    }
}

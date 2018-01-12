public class ConferenceRoom extends Room {

    private boolean chargeable;
    private String name;

    public ConferenceRoom(int capacity, String guests, boolean chargeable, String name) {
        super(capacity, guests);
        this.chargeable = chargeable;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

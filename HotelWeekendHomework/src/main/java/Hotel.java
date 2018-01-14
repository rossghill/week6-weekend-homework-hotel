import java.util.ArrayList;

public class Hotel {

    String hotelName;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    ArrayList<DiningRoom> diningRooms;

    public Hotel(String hotelName,
                 ArrayList<Bedroom> bedrooms,
                 ArrayList<ConferenceRoom> conferenceRooms,
                 ArrayList<DiningRoom> diningRooms) {
        this.hotelName = hotelName;
        this.bedrooms =  bedrooms;
        this.conferenceRooms =  conferenceRooms;
        this.diningRooms = diningRooms;
    }


    public String getName() {
        return hotelName;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public ArrayList<DiningRoom> getDiningRooms() {
        return diningRooms;
    }
}

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


}

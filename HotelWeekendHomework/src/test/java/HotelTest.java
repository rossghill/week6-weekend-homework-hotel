import org.junit.Before;

import Room.Bedroom;

import java.util.ArrayList;

public class HotelTest {

   Hotel hotel1;
   Bedroom bedroom1;
   Bedroom bedroom2;
   Bedroom bedroom3;
   ArrayList<Bedroom> bedrooms;
   DiningRoom diningRoom;
   ArrayList<DiningRoom> diningRooms;
   ConferenceRoom conferenceRoom;
   ArrayList<ConferenceRoom> conferenceRooms;

   @Before
    public void before() {
       bedroom1 = new Bedroom(1, false, 1, RoomType.SINGLE);
       bedroom2 = new Bedroom(2, false, 2, RoomType.DOUBLE);
       bedroom3 = new Bedroom(6, false, 3, RoomType.FAMILY);
       bedrooms = new ArrayList<>();
       bedrooms.add(bedroom1);
       bedrooms.add(bedroom2);
       bedrooms.add(bedroom3);
       conferenceRooms = new ArrayList<>();
       conferenceRooms.add(conferenceRoom);
       diningRooms = new ArrayList<>();
       diningRooms.add(diningRoom);
       hotel1 = new Hotel("Premier Inn", bedrooms, conferenceRooms, diningRooms);
   }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;

    @Before
    public void before() {
        bedroom1 = new Bedroom(2, "Ross", true, 45 );
        bedroom2 = new Bedroom(4, "Maureen, Gordon", true, 67);
    }

    @Test
    public void roomHasCapacity() {
        assertEquals(2, bedroom1.getCapacity());
    }

    @Test
    public void roomIsChargeable() {
        assertEquals(true, bedroom2.isChargeable());
    }

    @Test
    public void roomHasRoomNumber() {
        assertEquals(45, bedroom1.getRoomNumber());
    }

}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before() {
        guest1 = new Guest("Charlie");
        guest2 = new Guest("Mac");
        guest3 = new Guest("Dennis");
    }

    @Test
    public void getGuestName() {
        assertEquals("Charlie", guest1.getName());
    }

}

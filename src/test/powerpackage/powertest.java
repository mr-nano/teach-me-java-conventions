package powerpackage;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class powertest {
    @Test
    public void one_raised_to_one_is_onew() {
        assertEquals(powerfinder.OF(1,1),1);
    }

    @Test
    public void twoRaised_to_one_is_2() {
        assertEquals(powerfinder.OF(2,1),2);
    }

    @Test
    public void two_power_2_is_4() {
        assertEquals(powerfinder.OF(2,2),4);
    }

    @Test
    public void power_of_2_and_3_Is_SIX() {
        assertEquals(powerfinder.OF(3,2),9);
    }
}

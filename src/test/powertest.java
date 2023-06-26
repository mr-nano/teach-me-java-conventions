package powerpackage;


import org.junit.Test;

public class PowerTest {
    @Test
    public void one_raised_to_one_is_one()
    {
        assert powerfinder.of(1,1) == 1;
    }

    @Testō
    public void two_raised_to_one_is_two() {
        assert powerfinder.of(2,1) == 2;
    }

    @Test
    public void two_power_two_is_four() {
        assert powerfinder.of(2, 2) == 4;
    }

    @Test
    public void three_raised_two_is_nine() {
        assert powerfinder.of(3, 2) == 3*3;
    }
}

package powerpackage;


import org.junit.jupiter.api.Test;

public class PowerTest {
    @Test
    public void one_raised_to_one_is_onew() {
        assert PowerFinder.compute(1,1) == 1;
    }

    @Test
    public void twoRaised_to_one_is_2() {
        assert PowerFinder.compute(2,1) == 2;
    }

    @Test
    public void two_power_2_is_4() {
        assert PowerFinder.compute(2, 2) == 4;
    }

    @Test
    public void power_of_2_and_3_Is_SIX() {
        assert PowerFinder.compute(3, 2) == 3*3;
    }
}

package powerpackage;


import org.junit.Test;

public class powertest {
    @Test
    public void one_raised_to_one_is_one() {
        assert powerfinder.of(1,1) == 1;
    }

    @Test
    public void two_raised_to_one_is_two() {
        assert powerfinder.of(2,1) == 2;
    }

    @Test
    public void two_raised_to_two_is_four() {
        assert powerfinder.of(2, 2) == 4;
    }

    @Test
    public void three_raised_to_two_is_six() {
        assert powerfinder.OF(3, 2) == 9;
    }
}

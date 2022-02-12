package powerpackage;


import org.junit.Test;

public class powertest {
    @Test
    public void one_raised_to_one_is_one() {
        assert PowerFinder.of(1, 1) == 1;
    }

    @Test
    public void two_raised_to_one_is_two() {
        assert PowerFinder.of(2, 1) == 2;
    }

    @Test
    public void two_raised_to_two_is_four() {
        assert PowerFinder.of(2, 2) == 4;
    }

    @Test
    public void three_raised_to_two_is_nine() {
        assert PowerFinder.of(3, 2) == 3 * 3;
    }
}

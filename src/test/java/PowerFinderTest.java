import powerpackage.*;

import org.junit.Test;

public class PowerFinderTest {
    @Test
    public void shouldReturnOneWhenOneIsRaisedToOne() {

        int base = 1;
        int exponent = 1;
        int power = 1;

        assert PowerFinder.of(base, exponent) == power;
    }

    @Test
    public void shouldReturnTwoWhenTwoIsRaisedToOne() {

        int base = 2;
        int exponent = 1;
        int power = 2;

        assert PowerFinder.of(base, exponent) == power;
    }

    @Test
    public void shouldReturnFourWhenTwoIsRaisedToTwo() {

        int base = 2;
        int exponent = 2;
        int power = 4;

        assert PowerFinder.of(base, exponent) == power;
    }

    @Test
    public void shouldReturnNineWhenThreeIsRaisedToThree() {

        int base = 3;
        int exponent = 3;
        int power = 9;

        assert PowerFinder.of(base, exponent) == power;
    }
}

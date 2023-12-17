import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerFinderTest {
    @Test
    void oneRaisedOneIsOne() {
        PowerFinder powerFinder2 = new PowerFinder();
        int ans = powerFinder2.calculatePower(1,1);
        assertEquals(ans,1);

    }

    @Test
    void twoRaisedOneIsTwo() {
        PowerFinder powerFinder = new PowerFinder();
        int ans = powerFinder.calculatePower(2,1) ;
        Assertions.assertEquals(ans,2);
    }

    @Test
    void twoRaisedTwoIsFour() {
        PowerFinder powerFinder = new PowerFinder();
        int ans = powerFinder.calculatePower(2,2) ;
        Assertions.assertEquals(ans,4);
    }

    @Test
    void twoRaisedThreeIsSix() {
        PowerFinder powerFinder = new PowerFinder();
        int ans = powerFinder.calculatePower(2,3) ;
        Assertions.assertEquals(ans,8);
    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import powerpackage.PowerFinder;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class PowerFinderTest {
    @Test
    public void oneRaisedToOneIsOne() {
        PowerFinder powerFinder = new PowerFinder();
        int ans = powerFinder.calculatePower(1,1) ;
        Assertions.assertEquals(ans,1);

    }

    @Test
    public void twoRaisedToOneIsTwo() {
        PowerFinder powerFinder = new PowerFinder();
        int ans = powerFinder.calculatePower(2,1) ;
        Assertions.assertEquals(ans,2);
    }

    @Test
    public void twoPowerToTwoIsFour() {

        PowerFinder powerFinder = new PowerFinder();
        int ans = powerFinder.calculatePower(2,2) ;
        Assertions.assertEquals(ans,4);
    }

    @Test
    public void twoRaisedThreeIsSix() {
        PowerFinder powerFinder = new PowerFinder();
        int ans = powerFinder.calculatePower(2,3) ;
        Assertions.assertEquals(ans,6);
    }
}

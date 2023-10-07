package powerpackage;

public class PowerFinder {
    public static int compute(int base, int power) {
        int ans = 1;
        while(power != 0) {
            ans*=base;
            power--;
        }
        return ans;
    }
}

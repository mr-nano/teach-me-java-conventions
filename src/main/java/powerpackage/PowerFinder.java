package powerpackage;

public class PowerFinder {
    public static int of(int base, int exponent) {
        int power = 1;
        for (int iterator = 0; iterator < exponent; iterator++) {
            power *= base;
        }
        return power;
    }
}

package powerpackage;

public class PowerFinder {
    public static int of(int val, int pow) {
        int result = 1;
        for (int i = 0; i<pow; i++) {
            result *= val;
        }
        return result;
    }
}

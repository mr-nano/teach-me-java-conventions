package powerpackage;

public class powerfinder {
    public static int OF(int base, int power) {
        if(power == 0) {
            return 1;
        }

        if(power == 1) {
            return base;
        }

        return compute(base, power);
    }

    private static int compute(int base, int power) {
        int ans = base;
        while(power > 1) {
            ans *= base;
            power--;
        }
        return ans;
    }
}

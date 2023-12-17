public class PowerFinder {
    public int calculatePower(int base, int exponent) {
        int ans = 1;
        for (int counter = 0; counter<exponent; counter++) {
            ans *= base;
        }
        return ans;
    }
}

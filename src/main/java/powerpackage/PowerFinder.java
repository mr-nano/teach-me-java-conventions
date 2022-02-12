package powerpackage;

public class PowerFinder {
    public static int of(int base, int power) {
        int answer = 1;
        for (int i = 0; i < power; i++) {
            answer *= base;
        }
        return answer;
    }
}

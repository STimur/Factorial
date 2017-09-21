public class Factorial {
    public static int of(int n) {
        int acc = 1;
        while (n > 1) {
            acc *= n;
            n--;
        }
        return acc;
    }
}

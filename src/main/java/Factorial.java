public class Factorial {
    public static int of(int n) {
        if (n < 2)
            return 1;
        return n * of(n - 1);
    }
}

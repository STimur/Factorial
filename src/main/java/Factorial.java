public class Factorial {
    public static int of(int n) {
        if (n < 2)
            return 1;
        return n * (n - 1);
    }
}

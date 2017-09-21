public class Factorial {
    public static int of(int n) {
        return of(n, 1);
    }

    private static int of(int n, int acc) {
        if (n < 2)
            return acc;
        return of(n - 1, acc * n);
    }
}

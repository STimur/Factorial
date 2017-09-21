public class Factorial {
    public static int of(int n) {
        if (n < 2)
            return 1;
        return of(n, 1);
    }

    private static int of(int n, int acc) {
        if (n == 1)
            return acc;
        return of(n - 1, acc * n);
    }
}

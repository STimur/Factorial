public class Factorial {
    public static int of(int n) {
        return of(n, 1);
    }

    private static int of(int n, int acc) {
        while (n > 1) {
            acc *= n;
            n--;
        }
        return acc;
    }
}

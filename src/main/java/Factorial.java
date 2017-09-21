public class Factorial {
    public static int of(int n) {
        int acc = 1;
        for (; n > 1; acc *= n, n--) ;
        return acc;
    }
}

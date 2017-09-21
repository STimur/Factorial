import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    private void assertFactorialOf(int n, int expected) {
        assertEquals(expected, Factorial.of(n));
    }

    @Test
    public void zero() throws Exception {
        assertFactorialOf(0, 1);
    }

    @Test
    public void two() throws Exception {
        assertFactorialOf(2, 2);
    }

    @Test
    public void three() throws Exception {
        assertFactorialOf(3, 6);
    }

    @Test
    public void four() throws Exception {
        assertFactorialOf(4, 24);
    }

    @Test
    public void acceptance() throws Exception {
        assertFactorialOf(10, 3_628_800);
    }
}

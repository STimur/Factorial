import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void zero() throws Exception {
        assertEquals(1, Factorial.of(0));
    }

    @Test
    public void two() throws Exception {
        assertEquals(2, Factorial.of(2));
    }
}
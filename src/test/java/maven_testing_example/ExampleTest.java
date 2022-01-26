package maven_testing_example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExampleTest {
    @Test
    public void testOpCode0() throws InvalidOpCodeException {
        assertEquals(3, Example.doOperation(0, 1, 2));
    }

    @Test
    public void testOpCode1() throws InvalidOpCodeException {
        assertEquals(5, Example.doOperation(1, 8, 3));
    }

    @Test
    public void testOpCode2() throws InvalidOpCodeException {
        assertEquals(20, Example.doOperation(2, 5, 4));
    }

    @Test
    public void testOpCode3() throws InvalidOpCodeException {
        assertEquals(3, Example.doOperation(3, 15, 5));
    }

    @Test(expected = InvalidOpCodeException.class)
    public void testInvalidOpCode() throws InvalidOpCodeException {
        Example.doOperation(4, 0, 0);
    }
} // ExampleTest

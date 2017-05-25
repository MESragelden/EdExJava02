package javaPractice02;




import org.junit.*;
import static org.junit.Assert.*;

public class CounterTest {
    Counter c2;
    Counter c1;
    @Before
    public void setUp() {
	c1 = new Counter("Robin");
	c2 = new Counter("Robin");
    }
    
    @Test 
    public void testName() {
	assertTrue(c1.equals(c2));
    }

    @Test
    public void testIncrement() {
	// asserts that new val is current val +1
	assertTrue(c1.increment() == 1);
	assertTrue("This is swell", c1.increment() == 2);

    }

    @Test
    public void testDecrement() {
	assertTrue(c1.decrement() == -1);

    }

}

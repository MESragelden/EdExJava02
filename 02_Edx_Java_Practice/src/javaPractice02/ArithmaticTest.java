package javaPractice02;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmaticTest {

    @Test
    public void testMultiply() {
	assertEquals(6, Arithmatic.multiply(2, 3));
	assertEquals(100, Arithmatic.multiply(10, 10));
//	fail("Not yet implemented");
    }

    @Test
    public void testIsPositive() {
	assertTrue(Arithmatic.isPositive(4));
	assertTrue(Arithmatic.isPositive(1));
//	fail("Not yet implemented");
    }

}

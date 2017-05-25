package javaPractice02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest2 {
    BankAccount b;
    @Before
    public void setUp() throws Exception {
	b = new BankAccount("Default");
    }

    @Test
    public void testDeposit() {
	assertEquals(27, b.balance, 0.0);
	b.deposit(1);
	assertEquals(28, b.balance, 0.0);
    }

    @Test
    public void testOwner1() {
	assertEquals(b, new BankAccount("Default"));
    }
    @Test 
    public void testOwner2() {
	assertTrue(b == new BankAccount("Default"));
    }

    @Test
    public void testTestWithdraw() {
//	fail("Not yet implemented");
    }

}

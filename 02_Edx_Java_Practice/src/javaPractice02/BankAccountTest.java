package javaPractice02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
    BankAccount b;

    @Before
    public void setUp() throws Exception {
	b = new BankAccount("Default");
	
    }

    @Test
    public void testDeposit() {
	b.deposit(100);
	assertTrue(b.balance == 100);
	assertEquals(b.balance, 100, 0.0);
//	fail("Not yet implemented");
    }

    @Test
    public void testWithdraw() {
//	fail("Not yet implemented");
	b.deposit(1000);
	b.withdraw(100);
	assertTrue(b.balance == 900);
    }
    
   
}

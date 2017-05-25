package javaPractice02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AccountTestTest {

    AccountTest account;
    
    
    
    @Before
    public void setUp() throws Exception {
	account = new AccountTest("default");
    }

    @Test
    public void testDeposit() {
	assertEquals(27, account.balance, 0.1);
	account.deposit(1);
	assertEquals(28, account.balance, 0.1);
    }
    
    @Test 
    public void testOwner1() {
	assertEquals(account, new AccountTest("default"));
    }
    @Test 
    public void testOwner2() {
	assertTrue(account == new AccountTest("default"));
    }
    @Test 
    public void testOwner3() {
	assertTrue(account.equals(new AccountTest("default")));
    }

}

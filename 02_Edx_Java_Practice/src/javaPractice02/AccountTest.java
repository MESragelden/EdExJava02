package javaPractice02;

public class AccountTest {
    double balance;
    String accountOwner;
    
    public AccountTest(String owner) {
	balance = 27;
	accountOwner = owner;
    }
    
    void deposit(double amount) {
	balance = balance + amount;
    }
    
    void withdraw(double amount) {
	balance = balance - amount;
    }
    
    @Override 
    public boolean equals(Object o) {
	AccountTest p = (AccountTest)o;
	System.out.println(this.accountOwner == p.accountOwner);
	return this.accountOwner == p.accountOwner;
//	return this.accountOwner.equals(p.accountOwner);
//	return (((AccountTest) o).accountOwner).equals(accountOwner);
    }
     
    
    
    public static void main(String[] args) {
	

    }

}

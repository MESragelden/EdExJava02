package javaPractice02;

public class BankAccount {
    double balance;
    String accountOwner;
    
    public BankAccount(String owner) {
	this.balance = 27;
	this.accountOwner = owner;
    }
    
    // deposit
    public void deposit(double amount) {
	this.balance = balance += amount;
    }
    
    // withdraw
    public void withdraw(double amount) {
	this.balance = balance - amount;
    }
    
    
    public static void SOPL(double s) {
	System.out.println(s);
    }
    
    public static void main(String[] args) {
	BankAccount a = new BankAccount("Default");
	SOPL(a.balance);
	a.deposit(4000);
	SOPL(a.balance);
	System.out.println(a == new BankAccount("Default"));
	
	
    }

}

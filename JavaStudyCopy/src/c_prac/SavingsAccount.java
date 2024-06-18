package c_prac;

public class SavingsAccount extends BankAccount{
	
	public SavingsAccount(String accountNumber, int balance) {
		super(accountNumber, balance);
	}

	double interestRate = balance * 0.05;
	
	public double addInterestRate(int balance) {
		return balance += interestRate;
	}
}

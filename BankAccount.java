package bankaccount;

public class BankAccount {
	
	private double balance;
	
	public BankAccount() {
		balance = 0.0;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw (double amount) throws InSufficientFundException {
		
		if(amount > balance) {
			throw new InSufficientFundException("Insufficient balance");
		}
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}
}

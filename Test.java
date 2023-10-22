package bankaccount;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

	BankAccount account = new BankAccount();
	Scanner scanner = new Scanner(System.in);
	int choice;
	do {
		System.out.println("\n----------------BANK ACCOUNT MENU----------------\n\n1. Deposit"
				+ "\n2. Withdraw\n3. Show Current Balance\n4. Quit\nSelect an option: ");
		choice = scanner.nextInt();
		switch(choice) {
		case 1: 
			System.out.println("Deposit amount: ");
			double amount = scanner.nextDouble();
			account.deposit(amount);
			System.out.println("You deposited " + amount + " successfully!");
			break;
		case 2: 
			System.out.println("Withdrawal amount: ");
			double amount2 = scanner.nextDouble();
			try {
				account.withdraw(amount2);
			} catch (InSufficientFundException e) {
				System.out.println(e.toString());
				break;
			}
			System.out.println("You withdrew " + amount2 + " successfully!");
			break;
		case 3: 
			System.out.println("Current balance: "+ account.getBalance());
			break;			
		}
	} while (choice != 4);
	System.out.println("Bye, thanks you for being with us!");

	}

}

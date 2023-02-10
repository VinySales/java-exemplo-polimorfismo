package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		Account acc1 = new Account(1001, "Vini1", 1000.0);
		Account acc2 = new SavingsAccount(1002, "Vini", 1000.0, 0.01);

		acc1.withdraw(200.0);
		acc2.withdraw(200.0);
		
		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());
	}

}

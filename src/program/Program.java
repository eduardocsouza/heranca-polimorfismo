package program;

import entites.Account;
import entites.BusinessAccount;
import entites.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc1 = new Account(228, "Eduardo", 500.00);
		acc1.withdraw(200);
		System.out.println(acc1);
		
		Account acc2 = new SavingsAccount(245, "BOB", 1000.00, 0.01);
		acc2.withdraw(200);
		System.out.println(acc2);
		
		Account acc3 = new BusinessAccount(256, "alex", 1000.00, 500.00);
		acc3.withdraw(200);
		System.out.println(acc3);
	}
}

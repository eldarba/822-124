package bank.core.test;

import bank.core.Client;
import bank.core.ClientRegular;
import bank.core.exceptions.WithdrawException;

public class TestClientWitdraw {

	public static void main(String[] args) {

		Client c = new ClientRegular(101, "Dan", 100);
		System.out.println(c + " balance: " + c.getBalance());

		try {
			c.withdraw(10);
			System.out.println(c + " balance: " + c.getBalance());
			c.withdraw(100);
			System.out.println(c + " balance: " + c.getBalance());
		} catch (WithdrawException e) {
			e.printStackTrace();
		}

	}

}

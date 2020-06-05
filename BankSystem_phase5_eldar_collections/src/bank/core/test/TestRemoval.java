package bank.core.test;

import javax.swing.JOptionPane;

import bank.core.Account;
import bank.core.Bank;
import bank.core.Client;
import bank.core.ClientRegular;

public class TestRemoval {

	public static void main(String[] args) {

		// bank
		Bank bank = Bank.getInstance();

		// clients
		Client c1 = new ClientRegular(101, "aaa", 1000);
		Client c2 = new ClientRegular(102, "bbb", 2000);

		// clients accounts
		c1.addAccount(new Account(111, 5000));
		c1.addAccount(new Account(222, 7000));
		c1.addAccount(new Account(333, 11000));

		c2.addAccount(new Account(444, 10000));
		c2.addAccount(new Account(555, 200000));

		// add clients to bank
		try {
			bank.addClient(c1);
			bank.addClient(c2);
			bank.addClient(null);

		} catch (NullPointerException e) {
			System.out.println("ERROR");
			e.printStackTrace(System.out);
			System.out.println("end user message");
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
//		bank.addClient(null);

		c1.removeAccount(new Account(-1, 0));
		System.out.println("remove done");

		System.out.println("END of Main");

	}

}

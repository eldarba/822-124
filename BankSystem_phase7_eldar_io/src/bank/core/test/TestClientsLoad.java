package bank.core.test;

import javax.swing.JOptionPane;

import bank.core.Bank;
import bank.core.Client;
import bank.core.exceptions.BankException;

public class TestClientsLoad {

	public static void main(String[] args) {

		// bank
		Bank bank;
		try {
			bank = Bank.getInstance();

			for (Client client : bank.getClients()) {
				System.out.println(client);
			}

			System.out.println("END of Main");

		} catch (BankException e1) {
			// for programmer
			e1.printStackTrace();

			// for end user
			JOptionPane.showMessageDialog(null, e1.getMessage());
		}
	}

}

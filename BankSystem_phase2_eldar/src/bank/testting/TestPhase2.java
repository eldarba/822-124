package bank.testting;

import bank.core.Account;
import bank.core.Bank;
import bank.core.Client;

/**
 * @author jbt
 *
 */
public class TestPhase2 {

	public static void main(String[] args) {

		// create bank
		Bank bank = new Bank();

		// create clients
		Client cl1 = new Client(101, "Ann", 15_000.0F);
		Client cl2 = new Client(102, "Ben", 7_000.0F);
		Client cl3 = new Client(103, "Dan", 18_000.0F);

		// add clients to bank
		bank.addClient(cl1);
		bank.addClient(cl2);
		bank.addClient(cl3);

		// print bank clients
		printBankClients(bank);

		// do some client operations
		System.out.println("=== do some client operations");
		cl1.deposit(100);
		cl2.withdraw(300);
		cl3.addAccount(new Account(901, 17_500.65F));

		// print bank clients
		printBankClients(bank);
	}

	/**
	 * print client list of the specified bank
	 * 
	 * @param bank the bank holding the clients to print
	 */
	public static void printBankClients(Bank bank) {
		System.out.println("\n=========List of bank clients ====");
		Client[] clients = bank.getClients();
		for (int i = 0; i < clients.length; i++) {
			Client c = clients[i];
			System.out.println(
					c.getId() + ", " + c.getName() + ", balance: " + c.getBalance() + ", fortune: " + c.getFortune());
		}
		System.out.println("==================================\n");
	}

}

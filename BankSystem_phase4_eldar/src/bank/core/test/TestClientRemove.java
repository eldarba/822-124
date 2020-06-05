package bank.core.test;

import bank.core.Account;
import bank.core.Bank;
import bank.core.Client;
import bank.core.ClientRegular;

public class TestClientRemove {

	public static void main(String[] args) {

		// get a bank
		Bank bank = Bank.getInstance();

		// create a client
		Client client = new ClientRegular(101, "Avi", 250);
		client.addAccount(new Account(111, 25000));
		client.addAccount(new Account(222, 25000));

		// add the client to the bank
		bank.addClient(client);

		// remove the client with id: 101
		bank.removeClient(new ClientRegular(101, null, 0));
	}

}

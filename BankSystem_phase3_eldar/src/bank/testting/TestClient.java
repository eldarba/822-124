package bank.testting;

import bank.core.Account;
import bank.core.Client;
import bank.core.ClientGold;
import bank.core.ClientPlatinum;

public class TestClient {

	public static void main(String[] args) {

		// create a client
		Client client1 = new ClientGold(102, "AAA", 5_000);
		Client client2 = new ClientPlatinum(103, "BBB", 10_000);
		// create an account
		Account account1 = new Account(10001, 20_000.75F);
		Account account2 = new Account(10002, 20_000.75F);
		Account account3 = new Account(10003, 20_000.75F);
		Account account4 = new Account(10004, 20_000.75F);
		Account account5 = new Account(10005, 20_000.75F);
		Account account6 = new Account(10006, 20_000.75F);
		// add the accounts to the first client
		client1.addAccount(account1);
		client1.addAccount(account2);
		client1.addAccount(account3);
		client1.addAccount(account4);
		client1.addAccount(account5);
		client1.addAccount(account6);

		// add the accounts to the second client
		client2.addAccount(account6);

		System.out.println("==========");
		System.out.println(client2.getAccount(0));
		System.out.println(client2.getAccount(1));
		System.out.println(client2.getAccount(9000));

		System.out.println("==========");
		System.out.println("client balance: " + client2.getBalance());
		client2.removeAccount(new Account(999, 0));
		client2.removeAccount(new Account(10006, 0));
		System.out.println("client balance: " + client2.getBalance());

	}

}

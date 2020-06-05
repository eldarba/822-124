package app.view;

import java.util.Scanner;

import bank.core.Client;
import bank.core.ClientGold;
import bank.core.ClientPlatinum;
import bank.core.ClientRegular;

public class BankView {

	public void showMenu() {
		System.out.println();
		System.out.println("\t === Bank Menu ===========================");
		System.out.println("\t Add Client ............. ac / 1");
		System.out.println("\t Show All Clients ....... sac / 2");
		// add the following operations (and more)
		System.out.println("\t Add Client Account ..... aca / 3");
		System.out.println("\t Client Deposit ......... cd / 4");
		System.out.println("\t Client Withdraw ........ cw / 5");
		System.out.println("\t Remove Client .......... cw / 6");
		System.out.println("\t Remove Client Account .. rca / 7");
		//
		System.out.println("\t quit ................... q / 100");
		System.out.println("\t =========================================");
		System.out.print("\t Enter Your Choice: ");
	}

	public Client getClientFromUser(Scanner sc) {
		System.out.print("Enter Client ID: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter Client name: ");
		String name = sc.nextLine();
		System.out.print("Enter Client Balance: ");
		float balance = Float.parseFloat(sc.nextLine());
		System.out.println("Enter Client Type:");
		System.out.println("\t1 - Regular Client");
		System.out.println("\t2 - Gold Client");
		System.out.println("\t3 - Platinum Client");
		Client client = null;
		switch (sc.nextLine()) {
		case "1":
			client = new ClientRegular(id, name, balance);
			break;
		case "2":
			client = new ClientGold(id, name, balance);
			break;
		case "3":
			client = new ClientPlatinum(id, name, balance);
			break;
		default:
			System.out.println("Error in client type - client is null");
			break;
		}
		return client;
	}

	public void printAllClients(Client[] clients) {
		System.out.println("=== List of all Clients ==============");
		for (int i = 0; i < clients.length; i++) {
			Client c = clients[i];
			System.out.println("client id: " + c.getId() + ", name: " + c.getName() + ", balance: " + c.getBalance());
		}
		System.out.println("=== =================== ==============");
	}

}

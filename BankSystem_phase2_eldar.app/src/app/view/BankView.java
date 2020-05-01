package app.view;

import java.util.Scanner;

import bank.core.Client;

public class BankView {

	public void showMenu() {
		System.out.println();
		System.out.println("\t === Bank Menu ===========================");
		System.out.println("\t Add Client ............. ac / 1");
		System.out.println("\t Show All Clients ....... sac / 2");
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
		Client client = new Client(id, name, balance);
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

package bank.app;

import java.util.Scanner;

import bank.core.Account;
import bank.core.Bank;
import bank.core.Client;

public class BankApp {

	private Scanner sc = new Scanner(System.in);
	private String command;
	private boolean quit;
	Bank bank = new Bank();

	public static void main(String[] args) {
		BankApp app = new BankApp();
		app.start();
	}

	public void start() {
		System.out.println("Welcome to Bank System");
		while (!quit) {
			showMenue();
			this.command = sc.nextLine();
			doCommand();
		}
		System.out.println("Bank System Off... Bye");
	}

	private void showMenue() {
		System.out.println("\n\t=== MENU =======================================");
		System.out.println("\tadd client ............. ac");
		System.out.println("\tadd client account ..... aca");
		System.out.println();
		System.out.println("\tremove client .......... rc");
		System.out.println("\tremove client account .. rca");
		System.out.println();
		System.out.println("\tdeposit ................ d");
		System.out.println("\twithdraw ............... w");
		System.out.println();
		System.out.println("\tprint client details ... pcd");
		System.out.println("\tprint client account ... pca");
		System.out.println("\tprint all clients ...... pac");
		System.out.println("\tquit ................... q");
		System.out.println("\t================================================\n");
		System.out.print("Your command: ");

	}

	private void doCommand() {
		switch (command) {
		case "ac":
			addClient();
			break;
		case "aca":
			addClientAccount();
			break;
		case "rc":
			removeClient();
			break;
		case "rca":
			removeClientAccount();
			break;
		case "d":
			deposit();
			break;
		case "w":
			withdraw();
			break;
		case "pcd":
			printClientDetails();
			break;
		case "pca":
			printClientAccount();
			break;

		case "pac":
			printAllClients();
			break;
		case "q":
			exit();
			break;
		default:
			System.out.println("the command " + command + " is not supported");
		}
	}

	private void addClient() {
		System.out.print("enter client id: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.print("enter client name: ");
		String name = sc.nextLine();
		System.out.print("enter client balance: ");
		float balance = Float.parseFloat(sc.nextLine());
		Client client = new Client(id, name, balance);
		bank.addClient(client);
	}

	private void addClientAccount() {
		Client client = getClient();
		if (client != null) {
			System.out.print("enter account id: ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("enter account balance: ");
			float balance = Float.parseFloat(sc.nextLine());
			Account account = new Account(id, balance);
			client.addAccount(account);
		} else {
			System.out.println("client not found");
		}

	}

	private void removeClient() {
		Client c = getClient();
		if (c != null) {
			bank.removeClient(c.getId());
		} else {
			System.out.println("client not found");
		}

	}

	private void removeClientAccount() {
		Client c = getClient();
		if (c != null) {
			System.out.print("enter account id to remove: ");
			int accountId = Integer.parseInt(sc.nextLine());
			c.removeAccount(accountId);
		} else {
			System.out.println("client not found");
		}

	}

	private void deposit() {
		Client c = getClient();
		if (c != null) {
			System.out.print("enter deposit amount: ");
			float depositAmount = Float.parseFloat(sc.nextLine());
			c.deposit(depositAmount);
		} else {
			System.out.println("client not found");
		}

	}

	private void withdraw() {
		Client c = getClient();
		if (c != null) {
			System.out.print("enter withdraw amount: ");
			float withdrawAmount = Float.parseFloat(sc.nextLine());
			c.withdraw(withdrawAmount);
		} else {
			System.out.println("client not found");
		}

	}

	private void printClientDetails() {
		Client c = getClient();
		if (c != null) {
			System.out.println("id: " + c.getId() + ", name: " + c.getName() + ", balance: " + c.getBalance()
					+ ", fortune: " + c.getFortune());
		} else {
			System.out.println("client not found");
		}
	}

	private void printClientAccount() {
		Client c = getClient();
		if (c != null) {
			System.out.print("enter account index: ");
			int index = Integer.parseInt(sc.nextLine());
			Account ac = c.getAccount(index);
			if (ac != null) {
				System.out.println("account id: " + ac.getId() + ", balance: " + ac.getBalance());
			} else {
				System.out.println("account not found");
			}
		} else {
			System.out.println("client not found");
		}
	}

	private void printAllClients() {
		System.out.println("\n=========List of bank clients ====");
		Client[] clients = bank.getClients();
		for (int i = 0; i < clients.length; i++) {
			Client c = clients[i];
			System.out.println("id: " + c.getId() + ", name: " + c.getName() + ", balance: " + c.getBalance()
					+ ", fortune: " + c.getFortune());
		}
		System.out.println("==================================\n");

	}

	private Client getClient() {
		System.out.print("enter client id: ");
		int clientId = Integer.parseInt(sc.nextLine());
		Client[] clients = bank.getClients();
		for (int i = 0; i < clients.length; i++) {
			Client currClient = clients[i];
			if (currClient.getId() == clientId) {
				return currClient;
			}
		}
		return null;
	}

	private void exit() {
		sc.close();
		quit = true;

	}

}

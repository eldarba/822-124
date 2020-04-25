package bank.testting;

import java.util.Scanner;

import bank.core.Bank;
import bank.core.Client;

public class TestPhase2App {

	private Scanner sc = new Scanner(System.in);
	private String command;
	private boolean quit;
	Bank bank = new Bank();

	public void start() {

		System.out.println("Welcome to Bank System");
		while (!quit) {
			showMenue();
			command = sc.nextLine();
			doCommand();

		}
		System.out.println("Bank System Off... Bye");

	}

	private void showMenue() {
		System.out.println("\n=== MENU =======================================");
		System.out.println("quit ................... q");
		System.out.println("add client ............. ac");
		System.out.println("remove client .......... rc");
		System.out.println("print client list ...... pc");
		System.out.println("================================================\n");
		System.out.print("Your command: ");

	}

	private void doCommand() {

		switch (command) {
		case "q":
			exit();
			break;
		case "ac":
			addClient();
			break;
		case "rc":
			removeClient();
			break;
		case "pc":
			printClientList();
			break;

		default:
			System.out.println("the command " + command + " is not supported");
		}

	}

	private void removeClient() {
		System.out.print("enter client id: ");
		int clientId = Integer.parseInt(sc.nextLine());
		bank.removeClient(clientId);

	}

	private void printClientList() {
		System.out.println("\n=========List of bank clients ====");
		Client[] clients = bank.getClients();
		for (int i = 0; i < clients.length; i++) {
			Client c = clients[i];
			System.out.println("id: " + c.getId() + ", name: " + c.getName() + ", balance: " + c.getBalance()
					+ ", fortune: " + c.getFortune());
		}
		System.out.println("==================================\n");

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

	private void exit() {
		sc.close();
		quit = true;

	}

	public static void main(String[] args) {
		TestPhase2App app = new TestPhase2App();
		app.start();
	}

}

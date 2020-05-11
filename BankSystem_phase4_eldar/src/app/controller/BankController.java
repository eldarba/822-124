package app.controller;

import java.util.Scanner;

import app.view.BankView;
import bank.core.Bank;
import bank.core.Client;

public class BankController {

	/* the controller connects view and model and so they are here */
	private Bank bankModel = Bank.getInstance();
	private BankView bankView = new BankView();

	private boolean quit;
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BankController bankController = new BankController();
		bankController.start();
	}

	private void start() {
		while (!quit) {
			bankView.showMenu();
			String command = sc.nextLine();
			doCommand(command);
		}
		System.out.println("Bank System is Down");
	}

	private void doCommand(String command) {
		System.out.println();
		switch (command) {
		case "ac":
		case "1":
			System.out.println("doing command: add client");
			Client client = bankView.getClientFromUser(sc);
			bankModel.addClient(client);
			break;
		case "sac":
		case "2":
			System.out.println("doing command: show all clients");
			Client[] clients = bankModel.getClients();
//			bankView.printAllClients(clients);
			bankModel.printClientList();
			break;
		case "q":
		case "100":
			System.out.println("doing command: quit");
			this.quit = true;
			sc.close();
			System.out.println("Good Bye!!!");
			break;

		default:
			System.out.println("the command " + command + " is unknown");
			break;
		}
	}

}

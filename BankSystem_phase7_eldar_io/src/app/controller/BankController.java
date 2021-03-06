package app.controller;

import java.util.Scanner;

import app.view.BankView;
import bank.core.Bank;
import bank.core.Client;
import bank.core.exceptions.BankException;

public class BankController {

	{
		try {
			bankModel = Bank.getInstance();
		} catch (BankException e) {
			e.printStackTrace();
		}
	}

	/* the controller connects view and model and so they are here */
	private Bank bankModel;
	private BankView bankView = new BankView();

	private boolean quit;
	private Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BankController bankController = new BankController();
		try {
			bankController.start();
		} catch (BankException e) {
			e.printStackTrace();
		}
	}

	private void start() throws BankException {
		while (!quit) {
			bankView.showMenu();
			String command = sc.nextLine();
			doCommand(command);
		}
		System.out.println("Bank System is Down");
	}

	private void doCommand(String command) throws BankException {
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
			bankModel.printClientList();
			break;
		case "aca":
		case "3":
			System.out.println("doing command: add client account");
			int clientId = bankView.askForClientId(sc);
			bankModel.getCllient(clientId);
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

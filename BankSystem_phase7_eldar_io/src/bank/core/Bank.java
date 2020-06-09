package bank.core;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import bank.core.exceptions.BankException;
import bank.core.exceptions.BankLoadException;
import bank.core.exceptions.BankStoreException;

public class Bank {

	private List<Client> clients = new ArrayList<>();
//	private Logger logger = new Logger(null);
	Object accountUptater; // not supported yet
	private float balance;

	// make Bank Singleton ============
	private static Bank instance;
	private File dataFile = new File("files/bank.data");

	private Bank() throws BankException {
		load();
		System.out.println("Bank CTOR: clients loaded from file");
	}

	public static Bank getInstance() throws BankException {
		if (instance == null) {
			instance = new Bank();
		}
		return instance;
	}
	// ================================

	public void addCommission(float commissionAmount) {
		this.balance += commissionAmount;
	}

	public void printClientList() {
		Client[] allClients = this.getClientsArray();
		System.out.println("=== Client List ==================");
		for (int i = 0; i < allClients.length; i++) {
			System.out.println(allClients[i]);
		}
		System.out.println("==================================");
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	/**
	 * this operation returns the total fortune of all bank clients. It is
	 * calculated by summing the total clients balance and the total accounts
	 * balance – you should use Client.getFortune() method of each client.
	 */
	public float getClientFortune() {
		float totalFortune = 0;
		for (Client currClient : clients) {
			if (currClient != null) {
				totalFortune += currClient.getFortune();
			}
		}
		return totalFortune;
	}

//	/**
//	 * remove all null instances from the client list
//	 */
//	private void normalizeClientList() {
//		while (clients.contains(null)) {
//			clients.remove(null);
//		}
//	}

	/**
	 * add the client to the array and log the operation. You should seek the array
	 * and place the Client where the first null value is found.
	 * 
	 * @throws NullPointerException if the client parameter is null
	 */
	public void addClient(Client client) throws NullPointerException {
//		normalizeClientList();
		if (client != null) {
			clients.add(client);
			// LOG THE OPERATION ===
			long timestamp = System.currentTimeMillis();
			int clientId = client.getId();
			String description = "add client: " + client.getClass().getSimpleName();
			float amount = client.getFortune();
			Log log = new Log(timestamp, clientId, description, amount);
			Logger.log(log);
			// =====================
		} else {
			throw new NullPointerException("Sorry, the client was not added because no details where given.");
		}
	}

	/**
	 * remove the client with the specified id. Log the operation
	 * 
	 * @return true if removed, otherwise return false
	 */
	public boolean removeClient(Client clientToRemove) {
		// 1. get the index of real client
		int index = clients.indexOf(clientToRemove);
		if (index != -1) {
			// 2. get the reference of real client
			Client realClient = clients.get(index);
			// 3. remove the client
			clients.remove(index);
			System.out.println("client removed");
			// 4. log
			// LOG THE OPERATION ===
			long timestamp = System.currentTimeMillis();
			String description = "removeClient";
			float amount = realClient.getFortune();
			Log log = new Log(timestamp, clientToRemove.getId(), description, amount);
			Logger.log(log);
			// =====================
			return true;
		} else { // client not found: index = -1
			System.out.println("client NOT removed");
			return false;
		}
	}

	/**
	 * returns a clients array
	 */
	public Client[] getClientsArray() {
		return clients.toArray(new Client[clients.size()]);
	}

	public List<Client> getClients() {
		return clients;
	}

	/**
	 * view logs – prints all logs that are stored in the logger – leave empty for
	 * now
	 */
	public void viewLogs() {
		System.out.println("not supported yet");
	}

	/** startAccountUpdater() : void - leave empty for now */
	public void startAccountUpdater() {
		System.out.println("not supported yet");
	}

	public void store() throws BankStoreException {
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(dataFile)));) {
			// 3. write the clients list to file
			out.writeObject(clients);
			System.out.println("clients stored in: " + dataFile);
		} catch (IOException e) {
//			System.out.println(e.getMessage());
//			String causeMsg = e.getCause().getMessage();
			throw new BankStoreException("bank store clients failed", e);
		}
	}

	public void load() throws BankException {
		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)));) {
			clients = (List<Client>) in.readObject();
		} catch (EOFException e) {
			System.out.println("no previuos clients in file");
		} catch (IOException | ClassNotFoundException e) {
			throw new BankLoadException("the bank couldnt load the stored clients", e);
		}
	}

	/**
	 * @param clientId
	 * @return the client with the specified id.
	 * @throws BankException - if the specified client not found.
	 */
	public Client getCllient(int clientId) throws BankException {
		try {
			Client client = new ClientRegular(clientId, null, 0);
			client = clients.get(clients.indexOf(client));
			return client;
		} catch (IndexOutOfBoundsException e) {
			throw new BankException("client with id: " + clientId + " not found", e);
		}
	}

}

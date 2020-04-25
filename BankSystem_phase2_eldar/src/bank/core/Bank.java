package bank.core;

public class Bank {

	private Client[] clients = new Client[100];
	private Logger logger = new Logger(null);
	private Object accountUptater; // not supported yet
	private float balance;

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
		for (int i = 0; i < clients.length; i++) {
			Client currClient = clients[i];
			if (currClient != null) {
				totalFortune += currClient.getFortune();
			}
		}
		return totalFortune;
	}

	/**
	 * add the client to the array and log the operation. You should seek the array
	 * and place the Client where the first null value is found.
	 */
	public void addClient(Client client) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] == null) {
				clients[i] = client;
				// LOG THE OPERATION ===
				long timestamp = System.currentTimeMillis();
				int clientId = client.getId();
				String description = "addClient";
				float amount = client.getFortune();
				Log log = new Log(timestamp, clientId, description, amount);
				this.logger.log(log);
				// =====================
				break;
			}
		}
	}

	/**
	 * remove the client with the specified id from the array (by assigning a 'null'
	 * value to the array[position]). Log the operation
	 */
	public void removeClient(int clientId) {
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null && clients[i].getId() == clientId) {
				Client currClient = clients[i];
				clients[i] = null;
				// LOG THE OPERATION ===
				long timestamp = System.currentTimeMillis();
				String description = "removeClient";
				float amount = currClient.getFortune();
				Log log = new Log(timestamp, clientId, description, amount);
				this.logger.log(log);
				// =====================
				break;
			}
		}
	}

	/**
	 * returns a copy of the clients array without null elements
	 */
	public Client[] getClients() {
		int numberOfClients = 0;
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null) {
				numberOfClients++;
			}
		}
		Client[] clients = new Client[numberOfClients];
		int index = 0;
		for (int i = 0; i < this.clients.length; i++) {
			if (this.clients[i] != null) {
				clients[index++] = this.clients[i];
			}
		}
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

}

package bank.core;

import bank.core.exceptions.WithdrawException;

/** a client is a customer working with the bank */
public abstract class Client {

	// attributes
	private int id;
	private String name;
	private float balance;
	private Account[] accounts = new Account[5];
	// the rate (percentage) for commissions a client needs to give
	protected float commissionRate;
	// the rate (percentage) for interest a client will earn from the bank
	protected float interestRate;
//	private Logger logger;

	// CTOR
	public Client(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	/**
	 * add the account to the array and log the operation. You should seek the array
	 * and place the Account where the first null value is found.
	 */
	public void addAccount(Account account) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = account;
				// LOG THE OPERATION ===
				long timestamp = System.currentTimeMillis();
				int clientId = this.id;
				String description = "account added: " + account.getId();
				float amount = account.getBalance();
				Log log = new Log(timestamp, clientId, description, amount);
				Logger.log(log);
				// =====================
				return;
			}
		}
		// if we are here - the array of accounts was full
		System.out.println("Account not added because you already have " + accounts.length + " accounts");
	}

	/**
	 * returns the account of the specified index or null if does not exist
	 */
	public Account getAccount(int index) {
		if (index >= 0 && index <= accounts.length) {
			return accounts[index];
		} else {
			return null;
		}
	}

	/**
	 * remove the account with the same id from the array (by assigning a 'null'
	 * value to the array[position]) & transfers the money to the clients balance.
	 * Log the operation via creating Log object with appropriate data and sending
	 * it to the Logger.log(..) method.
	 */
	public void removeAccount(Account accountToRemove) {
		for (int i = 0; i < accounts.length; i++) {
			Account curr = accounts[i];
			if (curr != null && curr.equals(accountToRemove)) {
				accounts[i] = null; // remove the account by setting the array position to null
				this.balance += curr.getBalance(); // transfers the money to the clients balance
				// LOG THE OPERATION ===
				long timestamp = System.currentTimeMillis();
				int clientId = this.id;
				String description = "account removed: " + curr.getId();
				float amount = curr.getBalance();
				Log log = new Log(timestamp, clientId, description, amount);
				Logger.log(log);
				// =====================
				return;
			}
		}

		System.out.println("account id " + accountToRemove.getId() + " was not removed (not found)");
	}

	/**
	 * implement to add the amount from clients balance according to the commission
	 * (which is now zero). Use the commission data member in your calculation). log
	 * the operation
	 */
	public void deposit(float depositAmount) {
		float commission = depositAmount * this.commissionRate;
		this.balance += depositAmount;
		this.balance -= commission;
		Bank.getInstance().addCommission(commission); // transfer commission to the bank
		// LOG THE OPERATION ===
		long timestamp = System.currentTimeMillis();
		int clientId = this.id;
		String description = "deposit";
		float amount = depositAmount;
		Log log = new Log(timestamp, clientId, description, amount);
		Logger.log(log);
		// =====================
	}

	/**
	 * implement to subtract the amount from clients balance according to the
	 * commission (which is now zero). Use the commission data member in your
	 * calculation). log the operation
	 * 
	 * @throws WithdrawException
	 */
	public void withdraw(float withdrawAmount) throws WithdrawException {
		float commission = withdrawAmount * this.commissionRate;
		if ((withdrawAmount + commission) > this.balance) {
			throw new WithdrawException("withdraw error - you do not have enough money", this.id, this.balance,
					withdrawAmount + commission);
		}
		this.balance -= withdrawAmount;
		this.balance -= commission;
		// LOG THE OPERATION ===
		long timestamp = System.currentTimeMillis();
		int clientId = this.id;
		String description = "withdraw";
		float amount = withdrawAmount;
		Log log = new Log(timestamp, clientId, description, amount);
		Logger.log(log);
		// =====================
	}

	/**
	 * run over the accounts, calculate the amount to add according to the client
	 * interest (meanwhile it is zero) and add it to each account balance. Use the
	 * interest data member in your calculation. Log this operation.
	 */
	public void autoUpdateAccounts() {
		for (int i = 0; i < accounts.length; i++) {
			Account currAccount = accounts[i];
			if (currAccount != null) {
				float interest = currAccount.getBalance() * this.interestRate;
				currAccount.setBalance(currAccount.getBalance() + interest);
				// LOG THE OPERATION ===
				long timestamp = System.currentTimeMillis();
				int clientId = this.id;
				String description = "autoUpdateAccount: " + currAccount.getId();
				float amount = interest;
				Log log = new Log(timestamp, clientId, description, amount);
				Logger.log(log);
				// =====================
			}
		}
	}

	/**
	 * getFortune() : float – returns the sum of client balance + total account
	 * balance.
	 */
	public float getFortune() {
		float fortune = this.balance;
		for (int i = 0; i < accounts.length; i++) {
			Account currAccount = accounts[i];
			if (currAccount != null) {
				fortune += currAccount.getBalance();
			}
		}
		return fortune;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Client)) {
			return false;
		}
		Client other = (Client) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

}

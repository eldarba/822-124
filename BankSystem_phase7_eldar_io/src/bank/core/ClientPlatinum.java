package bank.core;

public class ClientPlatinum extends Client {

	public ClientPlatinum(int id, String name, float balance) {
		super(id, name, balance);
		this.commissionRate = 0.01F;
		this.interestRate = 0.005F;
	}

	@Override
	public String toString() {
		return "ClientPlatinum [id=" + getId() + "]";
	}

}

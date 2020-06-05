package bank.core;

public class ClientRegular extends Client {

	public ClientRegular(int id, String name, float balance) {
		super(id, name, balance);
		this.commissionRate = 0.03F;
		this.interestRate = 0.001F;
	}

	@Override
	public String toString() {
		return "ClientRegular [id=" + getId() + "]";
	}

}

package bank.core;

public class ClientGold extends Client {

	public ClientGold(int id, String name, float balance) {
		super(id, name, balance);
		this.commissionRate = 0.02F;
		this.interestRate = 0.003F;
	}

	@Override
	public String toString() {
		return "ClientGold [id=" + getId() + "]";
	}

}

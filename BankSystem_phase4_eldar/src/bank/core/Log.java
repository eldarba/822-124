package bank.core;

/**
 * a log object represents a single client transaction, together with the time,
 * amount and client identity
 */
public class Log {

	private long timestamp;
	private int clientId;
	private String description;
	private float amount;

	public Log(long timestamp, int clientId, String description, float amount) {
		super();
		this.timestamp = timestamp;
		this.clientId = clientId;
		this.description = description;
		this.amount = amount;
	}

	public String getData() {
		return "Log [timestamp=" + timestamp + ", clientId=" + clientId + ", description=" + description + ", amount="
				+ amount + "]";
	}

	@Override
	public String toString() {
		return getData();
	}

}

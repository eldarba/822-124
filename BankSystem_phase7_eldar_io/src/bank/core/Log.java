package bank.core;

import java.util.Date;

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
		Date date = new Date(timestamp);
		return "Log [date=" + date + ", clientId=" + clientId + ", description=" + description + ", amount=" + amount
				+ "]";
	}

	@Override
	public String toString() {
		return getData();
	}

}

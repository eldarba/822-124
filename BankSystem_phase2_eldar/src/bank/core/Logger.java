package bank.core;

/**
 * a logger is a mechanism for handling log instances (for example: store the
 * log in a database). for now the handling is to print the log data to screen
 */
public class Logger {

	/** the driver name will be used when a database is employed */
	private String driverName;

	public Logger(String driverName) {
		super();
		this.driverName = driverName;
	}

	/**
	 * handle a single log instance by printing it to screen
	 */
	public void log(Log log) {
		System.out.println(log.getData());
	}

	/**
	 * Retrieve all log instances from their storage and returns the in a Log array.
	 * for now returns null
	 */
	public Log[] getLogs() {
		return null;
	}

}

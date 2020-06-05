package bank.core.exceptions;

public class BankException extends Exception {

	private static final long serialVersionUID = 1L;

	public BankException() {
		super();
	}

	public BankException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BankException(String message, Throwable cause) {
		super(message, cause);
	}

	public BankException(String message) {
		super(message);
	}

	public BankException(Throwable cause) {
		super(cause);
	}

}

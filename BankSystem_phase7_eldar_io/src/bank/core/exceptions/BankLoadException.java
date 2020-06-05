package bank.core.exceptions;

public class BankLoadException extends BankException {

	private static final long serialVersionUID = 1L;

	public BankLoadException(String message, Throwable cause) {
		super(message, cause);
	}

	public BankLoadException(String message) {
		super(message);
	}

}

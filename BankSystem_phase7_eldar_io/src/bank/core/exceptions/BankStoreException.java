package bank.core.exceptions;

public class BankStoreException extends BankException {

	private static final long serialVersionUID = 1L;

	public BankStoreException(String message, Throwable cause) {
		super(message, cause);
	}

	public BankStoreException(String message) {
		super(message);
	}

}

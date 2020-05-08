package d.exceptions.person;

public class PersonIllegalAgeException extends Exception {

	public PersonIllegalAgeException() {
		super();
	}

	public PersonIllegalAgeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PersonIllegalAgeException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersonIllegalAgeException(String message) {
		super(message);
	}

	public PersonIllegalAgeException(Throwable cause) {
		super(cause);
	}

}

package b.homework;

public class BookDaoException extends Exception {

	private static final long serialVersionUID = 1L;

	public BookDaoException() {
		super();
	}

	public BookDaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BookDaoException(String message, Throwable cause) {
		super(message, cause);
	}

	public BookDaoException(String message) {
		super(message);
	}

	public BookDaoException(Throwable cause) {
		super(cause);
	}

}

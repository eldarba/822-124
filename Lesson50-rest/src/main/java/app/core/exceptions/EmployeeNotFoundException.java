package app.core.exceptions;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(Long id) {
		super("employee " + id + " not found");
	}

}

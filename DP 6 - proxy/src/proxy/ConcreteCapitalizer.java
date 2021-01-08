package proxy;

public class ConcreteCapitalizer implements Capitalizer {

	@Override
	public String modify(String text) {
		return text.toUpperCase();
	}

}

package b;

public class Transmission {

	private String type;
	
	public Transmission() {
		System.out.println("from Transmission CTOR");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Transmission [type=" + type + "]";
	}

}

package visitor;

public class Fruit implements ItemElement {

	private String name;
	private int pricePerKg;
	private int weight;

	public Fruit(String name, int pricePerKg, int weight) {
		super();
		this.name = name;
		this.pricePerKg = pricePerKg;
		this.weight = weight;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

	public String getName() {
		return name;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", pricePerKg=" + pricePerKg + ", weight=" + weight + "]";
	}

}

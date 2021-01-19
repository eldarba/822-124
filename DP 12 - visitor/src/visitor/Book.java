package visitor;

public class Book implements ItemElement {

	private int price;
	private String title;

	public Book(int price, String title) {
		super();
		this.price = price;
		this.title = title;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

	public int getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Book [price=" + price + ", title=" + title + "]";
	}

}

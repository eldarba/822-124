package visitor;

public class ShoppingCarVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {
		// apply 5$ discount for expensive books (over 50$)
		int cost = 0;
		if (book.getPrice() > 50) {
			cost = book.getPrice() - 5;
		} else {
			cost = book.getPrice();
		}
		System.out.println(book + " cost by visitor: " + cost);
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {
		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println(fruit + " cost by visitor: " + cost);
		return cost;
	}

}

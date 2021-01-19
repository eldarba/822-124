package visitor;

public class ShoppingCartClient {

	public static void main(String[] args) {

		ItemElement[] items = new ItemElement[4];

		items[0] = new Book(150, "Java DP 1");
		items[1] = new Book(20, "Java DP 2");
		items[2] = new Fruit("Banana", 12, 3);
		items[3] = new Fruit("Apple", 5, 5);

		int totalCost = getTotalPrice(items);
		System.out.println("total cost: " + totalCost);

	}

	/**
	 * a shopping would have a list of items and an instance of ShoppingCartVisitor
	 * to calculate total price at checkout
	 */
	public static int getTotalPrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCarVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum += item.accept(visitor);
		}
		return sum;
	}

}

package visitor;

public interface ItemElement {

	/**
	 * accept a visitor object to calculate item price and return the calculated
	 * price
	 */
	int accept(ShoppingCartVisitor visitor);

}

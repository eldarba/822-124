package b.homework;

public class App2 {

	public static void main(String[] args) {

		// create a DAO
		BookDAO dao = new BookDAODB();

		Book b = dao.get(101);
		System.out.println(b);
		if (b != null) {
			b.setTitle("Eldar and The Beans");
			b.setPrice(b.getPrice() * 1.1);
			dao.update(b);
			System.out.println("updated");
			System.out.println(b);
		} else {
			System.out.println("book not found");
		}
	}

}

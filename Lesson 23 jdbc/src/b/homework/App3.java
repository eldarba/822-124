package b.homework;

public class App3 {

	public static void main(String[] args) {

		try {
			// create a DAO
			BookDAO dao = new BookDAODB();

			Book b;
			b = dao.get(101);
			System.out.println(b);
			if (b != null) {
				dao.delete(b.getId());
				System.out.println("book deleted");
			} else {
				System.out.println("book not found");
			}
		} catch (BookDaoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

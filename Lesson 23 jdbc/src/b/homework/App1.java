package b.homework;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class App1 {

	public static void main(String[] args) {

		try {

			// create a book
			Date publication = new Date(new GregorianCalendar(1980, Calendar.MAY, 25).getTimeInMillis());
			Book book = new Book(101, "aaa", "eldar", publication, 50.25, 5, 10);

			// create a DAO
			BookDAO dao = new BookDAODB();

			// add book to the database
			dao.add(book);
			System.out.println("added " + book);

			System.out.println("============");
			System.out.println(dao.get(102));

		} catch (BookDaoException e) {
			e.printStackTrace();
		}
	}

}

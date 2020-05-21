package net.library.core.tests;

import net.library.core.Book;
import net.library.core.Library;

public class TestLibrary3 {

	public static void main(String[] args) {

		Library library = new Library("Eldar");
		library.print(true);

		System.out.println("\r\n=================\r\n");

		Book book1 = new Book("Basic Java", "E.B", 2018, 530);
		Book book2 = new Book("Advanced Java", "E.B", 2019, 600);
		Book book3 = new Book("Extreme Java", "E.B", 2020, 700);

		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3, 5);

		library.print(true);

	}

}

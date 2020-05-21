package net.library.core.tests;

import net.library.core.Book;
import net.library.core.Shelf;

public class TestLibrary2 {

	public static void main(String[] args) {

		Book book1 = new Book("Basic Java", "E.B", 2019, 530);
		Book book2 = new Book("Advanced Java", "E.B", 2020, 600);

		Shelf shelf = new Shelf(1);
		shelf.print(true);
		shelf.addBook(book1);
		shelf.addBook(book2);
		shelf.print(false);

	}

}

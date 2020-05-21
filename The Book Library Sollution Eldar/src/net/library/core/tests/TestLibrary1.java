package net.library.core.tests;

import net.library.core.Book;

public class TestLibrary1 {

	public static void main(String[] args) {

		Book book1 = new Book("Basic Java", "E.B", 2019, 530);
		Book book2 = new Book("Advanced Java", "E.B", 2020, 600);
		book1.print();
		book2.print();

	}

}

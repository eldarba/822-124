package net.library.core;

import java.util.ArrayList;
import java.util.List;

public class Shelf {

	// attributes
	/** must be non-negative */
	private int number;
	private List<Book> books;

	// constants
	public static final int MIN_NUMBER = 0;
	public static final int MAX_BOOKS = 5;
	public static final int MAX_PAGES = 1500;

	{
		init();
	}

	// CTORs
	public Shelf() {
	}

	public Shelf(int number) {
		super();
		setNumber(number);
	}

	// methods
	private void init() {
		books = new ArrayList<>();
	}

	public int getNumber() {
		return number;
	}

	public int getNumberOfBooks() {
		return books.size();
	}

	public int getNumberOfPages() {
		int totalPages = 0;
		for (Book book : books) {
			totalPages += book.getPages();
		}
		return totalPages;
	}

	/**
	 * add the specified book to the shelf if the limitations of maximum number of
	 * books and maximum number of pages is not violated and return true if
	 * succeeded, otherwise return false.
	 */
	public boolean addBook(Book book) {
		if (getNumberOfBooks() < MAX_BOOKS && getNumberOfPages() + book.getPages() <= MAX_PAGES) {
			books.add(book);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * removes the book of the specified index - first book index is 1 and return
	 * true on success, otherwise return false.
	 */
	public boolean removeBook(int bookIndex) {
		if (bookIndex <= getNumberOfBooks()) {
			books.remove(bookIndex - 1);
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		return books.isEmpty();
	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return "empty shelf";
		} else {
			StringBuilder sb = new StringBuilder();
			sb.append("\r\n\t");
			sb.append("The books on shelf ").append(number).append(" are: ");
			for (Book book : books) {
				sb.append("\r\n\t\t");
				sb.append(book);
			}
			return sb.toString();
		}
	}

	public String extendedToString() {
		if (isEmpty()) {
			return "Shelf " + number + " is empty";
		} else {
			return toString();
		}
	}

	public void print(boolean extended) {
		if (extended) {
			System.out.println(extendedToString());
		} else {
			System.out.println(this);
		}
	}

	public void setNumber(int number) {
		if (number >= MIN_NUMBER) {
			this.number = number;
		}
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

}

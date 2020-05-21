package net.library.core;

public class Library {

	private String name;
	private Shelf[] shelfs = new Shelf[10];

	/** create a library with 10 shelfs with the numbers 1 - 10 */
	public Library(String name) {
		super();
		this.name = name;
		init();
	}

	private void init() {
		for (int i = 0; i < shelfs.length; i++) {
			shelfs[i] = new Shelf(i + 1);
		}
	}

	public int getNumberOfBooks() {
		int numOfBooks = 0;
		for (Shelf shelf : shelfs) {
			numOfBooks += shelf.getNumberOfBooks();
		}
		return numOfBooks;
	}

	public int getNumberOfPages() {
		int numOfPages = 0;
		for (Shelf shelf : shelfs) {
			numOfPages += shelf.getNumberOfPages();
		}
		return numOfPages;
	}

	/**
	 * adds the book to the first available shelf and returns true, if available
	 * shelf is not found return false.
	 */
	public boolean addBook(Book book) {
		for (Shelf shelf : shelfs) {
			if (shelf.addBook(book)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * adds the book to the specified shelf and returns true if possible, otherwise
	 * return false.
	 */
	public boolean addBook(Book book, int shelfNumber) {
		for (Shelf shelf : shelfs) {
			if (shelf.getNumber() == shelfNumber) {
				if (shelf.addBook(book)) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	/**
	 * remove from the specified shelf (1 - 10) the book at the specified index (1 -
	 * 5)
	 * 
	 * @param shelfNumber in the range 1 - 10
	 * @param bookIndex   in the range 1 - 5
	 * @return
	 */
	public boolean removeBook(int shelfNumber, int bookIndex) {
		return shelfs[shelfNumber - 1].removeBook(bookIndex);
	}

	/**
	 * @return true if the library is empty, otherwise return false
	 */
	public boolean isEmpty() {
		for (Shelf shelf : shelfs) {
			if (!shelf.isEmpty()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		if (!isEmpty()) {
			StringBuilder sb = new StringBuilder();
			sb.append(name).append("'s library contains ").append(getNumberOfBooks()).append(" books summing ");
			sb.append(getNumberOfPages()).append(" pages.\r\n");
			sb.append("The books on ").append(name).append("’s library are:");

			for (Shelf shelf : shelfs) {
				if (!shelf.isEmpty()) {
					sb.append("\t").append(shelf.extendedToString());
				}
			}
			return sb.toString();
		} else {
			return "";
		}
	}

	public String extendedToString() {
		if (isEmpty()) {
			return getName() + "'s library is empty";
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Shelf[] getShelfs() {
		return shelfs;
	}

	public void setShelfs(Shelf[] shelfs) {
		this.shelfs = shelfs;
	}

}

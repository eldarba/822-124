package b.homework;

public interface BookDAO {

	void add(Book book);

	Book get(int bookId);

	void update(Book book);

	void delete(int bookId);

}

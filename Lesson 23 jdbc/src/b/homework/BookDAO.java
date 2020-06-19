package b.homework;

import java.util.List;

public interface BookDAO {

	void add(Book book) throws BookDaoException;

	Book get(int bookId) throws BookDaoException;

	List<Book> getAll() throws BookDaoException;

	void update(Book book) throws BookDaoException;

	void delete(int bookId) throws BookDaoException;

}

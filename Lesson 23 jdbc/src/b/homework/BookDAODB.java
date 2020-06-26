package b.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAODB implements BookDAO {

//	private String url = "jdbc:derby://localhost:1527/db1";
	private String url = "jdbc:sqlserver://localhost:1433;databaseName=db1;user=eldar1;password=pass1";

	@Override
	public void add(Book book) throws BookDaoException {
		try (Connection con = DriverManager.getConnection(url);) {
			// Statement stmt = con.createStatement();
			String sql = "insert into books values(?,?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			// set values for the ? parts of the sql
			pstmt.setInt(1, book.getId());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setDate(4, book.getPublication());
			pstmt.setDouble(5, book.getPrice());
			pstmt.setInt(6, book.getQuantity());
			pstmt.setDouble(7, book.getRating());
			// execute the prepared statement now that it is initialized
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new BookDaoException("add book failed", e);
		}

	}

	@Override
	public Book get(int bookId) throws BookDaoException {
		try (Connection con = DriverManager.getConnection(url);) {
			String sql = "select * from books where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			// set values for the ? parts of the sql
			pstmt.setInt(1, bookId);
			// execute the prepared statement now that it is initialized
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				// build the book based on the result set
				Book book = new Book(bookId);
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getDouble("price"));
				book.setPublication(rs.getDate("publication"));
				book.setQuantity(rs.getInt("quantity"));
				book.setRating(rs.getDouble("rating"));
				book.setTitle(rs.getString("title"));
				// now that the book is set - return it
				return book;
			}
		} catch (SQLException e) {
			throw new BookDaoException("get book failed", e);

		}
		return null; // if book not found return null
	}

	@Override
	public void update(Book book) throws BookDaoException {
		try (Connection con = DriverManager.getConnection(url);) {
			// Statement stmt = con.createStatement();
			String sql = "update books set title=?, author=?, publication=?, price=?, quantity=?, rating=? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			// set values for the ? parts of the sql
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setDate(3, book.getPublication());
			pstmt.setDouble(4, book.getPrice());
			pstmt.setInt(5, book.getQuantity());
			pstmt.setDouble(6, book.getRating());
			pstmt.setInt(7, book.getId());
			// execute the prepared statement now that it is initialized
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new BookDaoException("update book failed", e);
		}

	}

	@Override
	public void delete(int bookId) throws BookDaoException {
		try (Connection con = DriverManager.getConnection(url);) {
			// Statement stmt = con.createStatement();
			String sql = "delete from books where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			// set values for the ? parts of the sql
			pstmt.setInt(1, bookId);
			// execute the prepared statement now that it is initialized
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new BookDaoException("delete book failed", e);
		}

	}

	@Override
	public List<Book> getAll() throws BookDaoException {
		try (Connection con = DriverManager.getConnection(url);) {
			String sql = "select * from books";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			List<Book> list = new ArrayList<>();
			while (rs.next()) {
				// build the book based on the result set
				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setAuthor(rs.getString("author"));
				book.setPrice(rs.getDouble("price"));
				book.setPublication(rs.getDate("publication"));
				book.setQuantity(rs.getInt("quantity"));
				book.setRating(rs.getDouble("rating"));
				book.setTitle(rs.getString("title"));
				// now that the book is set - return it
				list.add(book);
			}
			return list;
		} catch (SQLException e) {
			throw new BookDaoException("get all books failed", e);
		}
	}

}

package b.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAODB implements BookDAO {

	private String url = "jdbc:derby://localhost:1527/db1";

	@Override
	public void add(Book book) {
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
			e.printStackTrace();
		}

	}

	@Override
	public Book get(int bookId) {
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
			e.printStackTrace();
		}
		return null; // if book not found return null
	}

	@Override
	public void update(Book book) {
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
			e.printStackTrace();
		}

	}

	@Override
	public Book delete(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}

package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo5StatemetsSelect {

	public static void main(String[] args) {

		String dbUrl = "jdbc:derby://localhost:1527/db1";
		String sql = "select * from books";

		try (Connection con = DriverManager.getConnection(dbUrl);) {
			System.out.println("connected to " + dbUrl);

			Statement stmt = con.createStatement();
			
			// on select we get a result set (table of results):
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(sql);
			
			while(rs.next()) { // next go to next row and returns true if exist
				int id = rs.getInt(1); // get a certain type from specified column
				String title = rs.getString(2);
				String author = rs.getString("author");
				System.out.println(id + ", " + title + ", " + author);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(sql);
		}

		System.out.println("disconnected from " + dbUrl);

	}

}

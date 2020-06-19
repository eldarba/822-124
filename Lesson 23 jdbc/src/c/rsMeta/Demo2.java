package c.rsMeta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {

	public static void main(String[] args) {

		String sql = "select id as book_number, title as כותר  from books";
		String url = "jdbc:derby://localhost:1527/db1";

		try (Connection con = DriverManager.getConnection(url);) {

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			// from the result set we can get the meta data
			ResultSetMetaData rsMeta = rs.getMetaData();

			int columnCount = rsMeta.getColumnCount();
			System.out.println("number of columns: " + columnCount);

			for (int i = 1; i <= rsMeta.getColumnCount(); i++) {
				System.out.println(rsMeta.getColumnName(i));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

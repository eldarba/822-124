package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo7StatemetsDelete {

	public static void main(String[] args) {

		String dbUrl = "jdbc:derby://localhost:1527/db1";
		String sql = "delete from books where id = 111";

		try (Connection con = DriverManager.getConnection(dbUrl);) {
			System.out.println("connected to " + dbUrl);

			// a statement is an object with which we can send SQL commands to the server
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
			System.out.println(sql);

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(sql);
		}

		System.out.println("disconnected from " + dbUrl);

	}

}

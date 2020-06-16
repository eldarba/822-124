package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo4StatemetsInsert {

	public static void main(String[] args) {

		String dbUrl = "jdbc:derby://localhost:1527/db1";
		String sql = "insert into books values(444, 'ddd', 'Eldar B')";

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

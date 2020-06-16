package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo2Connect {

	public static void main(String[] args) {
		
		String dbUrl = "jdbc:derby://localhost:1527/db1";
		
		try(Connection con = DriverManager.getConnection(dbUrl);) {
			System.out.println("connected to " + dbUrl);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("disconnected from " + dbUrl);

	}

}

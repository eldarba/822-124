package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3MySql {

	public static void main(String[] args) {
		// Connecting using SQL Server Authentication
		String connectionUrl = "jdbc:mysql://localhost:3306/db1?serverTimezone=UTC";
		String sql = "insert into products (productName, productPrice)values('Paper', 7)";

		try (

				Connection con = DriverManager.getConnection(connectionUrl, "eldar1", "pass1");
				Statement stmt = con.createStatement();

		) {
			System.out.println("connected");
			// adding product to the products table
//			int rowCount = stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS); // to get the auto generated
//																						// productId
//			if (rowCount == 1) {
//				// get the product id
//				ResultSet rsKeys = stmt.getGeneratedKeys();
//				if (rsKeys.next()) {
//					int productId = rsKeys.getInt(1);
//					System.out.println("the product id is: " + productId);
//				}
//			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

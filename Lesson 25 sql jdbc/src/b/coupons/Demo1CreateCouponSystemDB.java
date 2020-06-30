package b.coupons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1CreateCouponSystemDB {

	public static void main(String[] args) {
		// Connecting to master database to create a database
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=master;IntegratedSecurity=true";
		String databaseNameCoupons = "CouponSystemDb";
		String sql = "create database " + databaseNameCoupons;

		try (

				Connection con = DriverManager.getConnection(connectionUrl);

				Statement stmt = con.createStatement();

		) {
			System.out.println("connected");
			stmt.executeUpdate(sql);
			System.out.println(sql);
			System.out.println("database created");

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(sql);
		}

		// connect to the new database
		connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=" + databaseNameCoupons
				+ ";IntegratedSecurity=true";

		// create the companies table
		sql = "create table companies(";
		sql += "id int identity(1,1) primary key,";
		sql += "name varchar(50),";
		sql += "email varchar(50),";
		sql += "passwoed varchar(50)";
		sql += ")";
		try (

				Connection con = DriverManager.getConnection(connectionUrl);

				Statement stmt = con.createStatement();

		) {
			System.out.println("connected");
			// create the first table
			stmt.executeUpdate(sql);
			System.out.println(sql);
			System.out.println("table created");

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(sql);
		}
	}

}

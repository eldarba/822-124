package org.eldar.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connections {

	public static void main(String[] args) {

		{ // Apache Derby ==========

			String protocol = "jdbc:derby://";
			String host = "localhost:";
			String port = "1527/";
			String dbName = "db1";

			String url = protocol + host + port + dbName;

			try (Connection con = DriverManager.getConnection(url)) {

				System.out.println("connected to: " + url);

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		{ // MySql ====================

			String protocol = "jdbc:mysql://";
			String host = "localhost";
			String port = ":3306/";
//		String dbName = ""; // sys
			String dbName = "db1";
			String params = "?serverTimezone=UTC";

			String url = protocol + host + port + dbName + params;

			String user = "eldar1";
			String password = "pass1";

			try (Connection con = DriverManager.getConnection(url, user, password)) {

				System.out.println("connected to: " + url);

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		{ // SQL Server ===============

			String protocol = "jdbc:sqlserver://";
			String host = "localhost";
			String port = ":1433";
//		String dbName = ""; // master
			String dbName = ";databaseName=db1";

			String url = protocol + host + port + dbName;
			// String url =
			// "jdbc:sqlserver://localhost:1433;databaseName=db2;user=eldar1;password=pass1";

			String user = "eldar1";
			String password = "pass1";

			try (Connection con = DriverManager.getConnection(url, user, password)) {

				System.out.println("connected to: " + url);

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
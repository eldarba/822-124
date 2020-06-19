package c.rsMeta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class Demo1 {

	public static void main(String[] args) {

		String sql = "select * from books";
		String url = "jdbc:derby://localhost:1527/db1";

		try (Connection con = DriverManager.getConnection(url);) {

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			// from the result set we can get the meta data
			ResultSetMetaData rsMeta = rs.getMetaData();

			int columnCount = rsMeta.getColumnCount();
			System.out.println("number of columns: " + columnCount);

			for (int i = 1; i <= rsMeta.getColumnCount(); i++) {
				System.out.println(rsMeta.getColumnName(i) + " - " + rsMeta.getColumnLabel(i));
			}

			int type = rsMeta.getColumnType(4);
			String typeStr = rsMeta.getColumnTypeName(4);
			System.out.println("type: " + type);
			System.out.println("type: " + typeStr);

			Types t;
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

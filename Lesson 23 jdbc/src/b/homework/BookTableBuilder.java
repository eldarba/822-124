package b.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BookTableBuilder {

	public static void main(String[] args) {
		
		// 1. set the sql statement
		StringBuilder sb = new StringBuilder("create table Books(");
		sb.append("id integer, ");
		sb.append("title varchar(25), ");
		sb.append("author varchar(25), ");
		sb.append("publication date, ");
		sb.append("price float, ");
		sb.append("quantity integer, ");
		sb.append("rating float)");
		
		String sql = sb.toString();
		System.out.println(sql);
		
		// 2. set the db url
		String url = "jdbc:derby://localhost:1527/db1";
		
		// 3. establish connection
		try(Connection con = DriverManager.getConnection(url + ";create=true");){
			// 4. get a statement object from the connection
			Statement stmt = con.createStatement();
			
			// 5. execute the sql
			stmt.executeUpdate(sql);
			System.out.println("table created");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}

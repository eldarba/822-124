package b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Demo1PreparedStatements {

	public static void main(String[] args) {

		String dbUrl = "jdbc:derby://localhost:1527/db1";
		
		String sql = "select * from books where id = ?";

		try (Connection con = DriverManager.getConnection(dbUrl);) {
			System.out.println("connected to " + dbUrl);

			PreparedStatement pstmt = con.prepareStatement(sql);
			int id = Integer.parseInt(JOptionPane.showInputDialog("enter book id"));
			pstmt.setInt(1, id); // set the id value in the first ? (index=1) 
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println("book title: " + rs.getString("title"));
			}else {
				System.out.println("book with id " + id + " not found");
			}
			
			System.out.println(sql);

		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(sql);
		}

		System.out.println("disconnected from " + dbUrl);

	}

}

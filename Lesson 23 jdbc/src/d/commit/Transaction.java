package d.commit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Transaction {

	public static void main(String[] args) {

		String url = "jdbc:derby://localhost:1527/db1";

		Connection con = null;
		try {
			con = DriverManager.getConnection(url);
			con.setAutoCommit(false);
			//
			//
			//

			// COMMIT THE CHANGES IF ALL IS GOOD
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {

				// ROLLBACK (FORGET) THE CHANGES IF SOMETHING WENT WRONG ON THE WAY
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}

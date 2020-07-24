package coupon.system.core.pools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import coupon.system.core.exceptions.CouponSystemException;

public class ConnectionPool {

	private Set<Connection> connections = new HashSet<>();
	private static ConnectionPool instance;
	private static final int SIZE = 10;
	private String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=db1;IntegratedSecurity=true";

	private ConnectionPool() throws CouponSystemException {

		try {
			for (int i = 0; i < SIZE; i++) {
				connections.add(DriverManager.getConnection(dbUrl));
			}
		} catch (SQLException e) {
			throw new CouponSystemException("initializing connection pool failed", e);
		}
	}

	public static ConnectionPool getInstance() throws CouponSystemException {
		if (instance == null) {
			instance = new ConnectionPool();
		}
		return instance;
	}

	public synchronized Connection getConnection() {
		while (connections.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Iterator<Connection> it = connections.iterator();
		Connection con = it.next();
		it.remove();
		return con;
	}

	public void restoreConnection(Connection con) {
		// TODO Auto-generated method stub

	}

}

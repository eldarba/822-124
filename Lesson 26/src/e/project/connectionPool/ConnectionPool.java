package e.project.connectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Set;

public class ConnectionPool {

	private Set<Connection> connections;
	private static ConnectionPool instance;
	private static final int SIZE = 10;
	private String dbUrl = "";

	private ConnectionPool() throws SQLException {
		for (int i = 0; i < SIZE; i++) {
			connections.add(DriverManager.getConnection(dbUrl));
		}
	}

	public static ConnectionPool getInstance() throws SQLException {
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

}

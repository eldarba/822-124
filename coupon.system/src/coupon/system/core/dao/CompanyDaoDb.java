package coupon.system.core.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import coupon.system.core.beans.Company;
import coupon.system.core.exceptions.CouponSystemException;
import coupon.system.core.pools.ConnectionPool;

public class CompanyDaoDb implements CompanyDao {

	@Override
	public void add(Company company) throws CouponSystemException {
		// 1. get connection from pool
		Connection con = ConnectionPool.getInstance().getConnection();
		try (PreparedStatement pstmt = con.prepareStatement("sqlsqlsql ?, ?")) {
			// 2. perform actions against the database
			pstmt.setInt(1, 100);
			pstmt.setInt(2, 200);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// 3. in case of exception wrap it in CouponSystemException and throw it
			throw new CouponSystemException("add company failed", e);
		} finally {
			// 4. finally give the connection back to pool (do not close it)
			ConnectionPool.getInstance().restoreConnection(con);
		}
	}

	@Override
	public Company get(int id) throws CouponSystemException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Company t) throws CouponSystemException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) throws CouponSystemException {
		// TODO Auto-generated method stub

	}

}

package coupon.system.tests;

import coupon.system.core.beans.Company;
import coupon.system.core.dao.CompanyDao;
import coupon.system.core.dao.CompanyDaoDb;
import coupon.system.core.exceptions.CouponSystemException;

public class Test1 {

	public static void main(String[] args) {
		try {
			Company c = new Company();
			CompanyDao dao = new CompanyDaoDb();
			dao.add(c);
		} catch (CouponSystemException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}

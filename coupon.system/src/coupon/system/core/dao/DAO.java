package coupon.system.core.dao;

import coupon.system.core.exceptions.CouponSystemException;

public interface DAO<T> {

	void add(T t) throws CouponSystemException;

	T get(int id) throws CouponSystemException;

	void update(T t) throws CouponSystemException;

	void delete(int id) throws CouponSystemException;

}

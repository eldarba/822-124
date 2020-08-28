package app.core.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.core.entities.Coupon;
import app.core.entities.Review;

public class App01 {

	public static void main(String[] args) {

		Configuration config = new Configuration().addAnnotatedClass(Coupon.class).addAnnotatedClass(Review.class)
				.configure();

		try (SessionFactory factory = config.buildSessionFactory();) {

			Session session = null;
			try {
				session = factory.getCurrentSession();
				session.beginTransaction();

				// =======================
				Coupon c1 = new Coupon("aaa");
				Coupon c2 = new Coupon("bbb");

				c1.addReview(new Review("very good"));
				c1.addReview(new Review("nice"));
				c1.addReview(new Review("excelent"));

				c2.addReview(new Review("Tov"));
				c2.addReview(new Review("Tov Meod"));

				int id = (int) session.save(c1);
				session.save(c2);
				System.out.println("coupon id: " + id);
				// =======================

				session.getTransaction().commit();

			} catch (Exception e) {
				e.printStackTrace();
				session.getTransaction().rollback();
				System.out.println("rolled back");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

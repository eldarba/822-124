package app.core.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.core.entities.Coupon;
import app.core.entities.Customer;
import app.core.entities.Review;
import app.core.entities.Student;
import app.core.entities.University;

public class App3 {

	public static void main(String[] args) {

		Configuration config = new Configuration().addAnnotatedClass(Coupon.class).addAnnotatedClass(Review.class)
				.configure().addAnnotatedClass(Student.class).addAnnotatedClass(University.class)
				.addAnnotatedClass(Customer.class);

		try (SessionFactory factory = config.buildSessionFactory();) {

			Session session = null;
			try {
				session = factory.getCurrentSession();
				session.beginTransaction();

				// =======================
				Coupon c1 = new Coupon("aaa");
				Coupon c2 = new Coupon("bbb");
				session.save(c1);
				session.save(c2);

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

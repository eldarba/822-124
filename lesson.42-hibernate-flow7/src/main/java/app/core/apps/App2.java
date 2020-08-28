package app.core.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.core.entities.Coupon;
import app.core.entities.Review;
import app.core.entities.Student;
import app.core.entities.University;

public class App2 {

	public static void main(String[] args) {

		Configuration config = new Configuration().addAnnotatedClass(Coupon.class).addAnnotatedClass(Review.class)
				.configure().addAnnotatedClass(Student.class).addAnnotatedClass(University.class);

		try (SessionFactory factory = config.buildSessionFactory();) {

			Session session = null;
			try {
				session = factory.getCurrentSession();
				session.beginTransaction();

				// =======================
				University u1 = new University("Ben Gurion", "Israel");
				University u2 = new University("Bar Illan", "Israel");

				session.save(u1);
				session.save(u2);

				Student s1 = new Student("dan");
				Student s2 = new Student("ran");
				Student s3 = new Student("ben");
				Student s4 = new Student("adva");
				Student s5 = new Student("vered");

				s1.setUniversity(u1);
				s2.setUniversity(u2);
				s3.setUniversity(u2);
				s4.setUniversity(u1);
				s5.setUniversity(u2);

				session.save(s1);
				session.save(s2);
				session.save(s3);
				session.save(s4);
				session.save(s5);
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

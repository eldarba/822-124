package app.core.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.core.entities.Coupon;
import app.core.entities.Review;
import app.core.entities.Student;
import app.core.entities.University;

public class App3getStudent {

	public static void main(String[] args) {

		Configuration config = new Configuration().addAnnotatedClass(Coupon.class).addAnnotatedClass(Review.class)
				.configure().addAnnotatedClass(Student.class).addAnnotatedClass(University.class);

		try (SessionFactory factory = config.buildSessionFactory();) {

			Session session = null;
			try {
				session = factory.getCurrentSession();
				session.beginTransaction();

				// =======================
				Student student = session.get(Student.class, 2);
				System.out.println(student);
				System.out.println("at ");
				University univ = student.getUniversity();
				System.out.println(univ);

				System.out.println("with: ");
				for (Student s : univ.getStudents()) {
					System.out.println(s.getName());
				}

				// =======================
				System.out.println("deleting");
				session.delete(univ);

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

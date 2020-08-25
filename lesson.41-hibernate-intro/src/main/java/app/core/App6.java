package app.core;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.core.entities.Student;

public class App6 {

	public static void main(String[] args) {

		// get a session factory
		try (SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class)
				.buildSessionFactory();) {
			Session session = null;
			try {
				// get a session
				session = factory.getCurrentSession();
				// start a transaction
				session.beginTransaction();

				// ======================
				String jpql = "from Student";
//				String jpql = "from Student where id < 5";
				TypedQuery<Student> query = session.createQuery(jpql, Student.class);
				List<Student> list = query.getResultList();

				for (Student student : list) {
					System.out.println(student);
				}
				// ======================

				session.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				if (session != null) {
					session.getTransaction().rollback();
				}

			}
		}

	}

}

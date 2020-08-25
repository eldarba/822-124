package app.core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.core.entities.Student;

public class App2 {

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
				Student st = session.get(Student.class, 2);
				st.setName("D");
//				session.flush(); // for print only
				System.out.println(st);
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

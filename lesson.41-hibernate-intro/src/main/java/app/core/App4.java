package app.core;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.core.entities.Student;

public class App4 {

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
				String jpql = "select std from Student std where std.id=:theId";
//				String jpql = "select std from Student std where std.id=?1";
				Query query = session.createQuery(jpql);
				query.setParameter("theId", 3);
//				query.setParameter(1, 3);
				Object obj = query.getSingleResult();
				System.out.println(obj);
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

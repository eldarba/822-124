package app.core;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.core.entities.Student;

public class App5 {

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
				TypedQuery<Student> query = session.createQuery(jpql, Student.class);
				query.setParameter("theId", 3);
//				query.setParameter(1, 3);
				Student std = query.getSingleResult();
				System.out.println(std);
				System.out.println(std.getId());
				System.out.println(std.getName());
				System.out.println(std.getEmail());
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

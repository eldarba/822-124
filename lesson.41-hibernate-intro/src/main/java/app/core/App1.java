package app.core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.core.entities.Student;

public class App1 {

	public static void main(String[] args) {

		// this object represents the configuration info (xml file) as an object
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);

		// get a session factory

		try (SessionFactory factory = cfg.buildSessionFactory();) {
			Session session = null;
			try {
				// get a session
				session = factory.getCurrentSession();
				// start a transaction
				session.beginTransaction();
				Student student1 = new Student(null, "Ron", "aaaMail");
				Student student2 = new Student(null, "Dan", "bbbMail");
				Student student3 = new Student(null, "Rina", "cccMail");
				// the students are now transient
				session.save(student1);
				session.save(student2);
				session.save(student3);
				// the students are now persistent
				session.getTransaction().commit();
				// the student is now in the database
			} catch (Exception e) {
				e.printStackTrace();
				if (session != null) {
					session.getTransaction().rollback();
				}

			}
		}

	}

}

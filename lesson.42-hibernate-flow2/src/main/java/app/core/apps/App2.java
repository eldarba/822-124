package app.core.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.core.entities.Company;
import app.core.entities.CompanyAddress;

public class App2 {

	public static void main(String[] args) {

		Configuration config = new Configuration().addAnnotatedClass(Company.class)
				.addAnnotatedClass(CompanyAddress.class).configure();

		try (SessionFactory factory = config.buildSessionFactory();) {

			Session session = null;
			try {
				session = factory.getCurrentSession();
				session.beginTransaction();

				// =======================
				int id = 2;
				Company c = session.get(Company.class, id);
				System.out.println(c);
				System.out.println(c.getAddress());

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

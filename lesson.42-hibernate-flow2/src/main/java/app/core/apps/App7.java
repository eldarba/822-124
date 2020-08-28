package app.core.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.core.entities.Company;
import app.core.entities.CompanyAddress;

public class App7 {

	public static void main(String[] args) {

		Configuration config = new Configuration().addAnnotatedClass(Company.class)
				.addAnnotatedClass(CompanyAddress.class).configure();

		try (SessionFactory factory = config.buildSessionFactory();) {

			Session session = null;
			try {
				session = factory.getCurrentSession();
				session.beginTransaction();

				// =======================
				Company company = session.get(Company.class, 1);
				CompanyAddress address = session.get(CompanyAddress.class, 2);

				session.delete(company);
//				session.delete(address);
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

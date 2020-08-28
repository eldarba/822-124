package app.core.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.core.entities.Company;
import app.core.entities.CompanyAddress;

public class App6 {

	public static void main(String[] args) {

		Configuration config = new Configuration().addAnnotatedClass(Company.class)
				.addAnnotatedClass(CompanyAddress.class).configure();

		try (SessionFactory factory = config.buildSessionFactory();) {

			Session session = null;
			try {
				session = factory.getCurrentSession();
				session.beginTransaction();

				// =======================
				Company c1 = new Company("aaa", "aaaMail");
				Company c2 = new Company("bbb", "aaaMail");
				Company c3 = new Company("ccc", "aaaMail");
				c1.setAddress(new CompanyAddress("aaa", "aaa"));
				c2.setAddress(new CompanyAddress("bbb", "aaa"));
				c3.setAddress(new CompanyAddress("ccc", "aaa"));
				session.save(c1);
				session.save(c2);
				session.save(c3);
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

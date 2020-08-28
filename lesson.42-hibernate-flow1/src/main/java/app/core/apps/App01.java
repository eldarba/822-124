package app.core.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import app.core.entities.Company;
import app.core.entities.CompanyAddress;

public class App01 {

	public static void main(String[] args) {

		Configuration config = new Configuration().addAnnotatedClass(Company.class)
				.addAnnotatedClass(CompanyAddress.class).configure();

		try (SessionFactory factory = config.buildSessionFactory();) {

			Session session = null;
			try {
				session = factory.getCurrentSession();
				session.beginTransaction();

				// =======================
				CompanyAddress address = new CompanyAddress("Tel Aviv", "Israel");
				Company company = new Company("Yosi and Sons", "yosi@mail");
				company.setAddress(address);

				session.save(company);
				System.out.println("the company: " + company);
				System.out.println("the address" + company.getAddress());

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

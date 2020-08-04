package proxy.design.pattern;

public class CompanyDaoProxy implements CompanyDao {

	private CompanyDaoImpl dao = new CompanyDaoImpl();

	@Override
	public void addCompany(String name) {
		System.out.println("Proxy: " + "before");
		dao.addCompany(name);
		System.out.println("Proxy: " + "after");
	}

}

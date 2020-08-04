package proxy.design.pattern;

public class CompanyDaoImpl implements CompanyDao {

	@Override
	public void addCompany(String name) {
		System.out.println("added " + name);
	}

}

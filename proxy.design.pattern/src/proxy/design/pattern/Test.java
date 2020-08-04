package proxy.design.pattern;

public class Test {

	public static void main(String[] args) {
		CompanyDao dao = new CompanyDaoProxy();
		dao.addCompany("AAA");
	}

}

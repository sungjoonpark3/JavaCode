package staticex;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company company = Company.getInstance();
		
		Company company2 = Company.getInstance();
		
		System.out.println(company);
		System.out.println(company2);

	}

}

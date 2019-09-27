package Chapter7;

public class OverridingTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(1000,"이순신");
		customerLee.bonusPoint=1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020,"김말순");
		customerKim.bonusPoint=10000;
		
		int kimPrice=customerKim.calcPrice(10000);
		int leePrice=customerLee.calcPrice(10000);
		
		System.out.println(customerKim.showCusomerInfo()+"지불금액은"+kimPrice);
		System.out.println(customerLee.showCusomerInfo()+"지불금액은"+leePrice);
	}

}

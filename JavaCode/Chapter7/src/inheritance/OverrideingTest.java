package inheritance;

public class OverrideingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint = 1000;
	
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신");
		customerKim.bonusPoint = 10000;
		
		int priceLee=customerLee.calcPrice(10000);
		int priceKim=customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCusomerInfo()+"지불금액은"+priceLee+"입니다.");
		System.out.println(customerKim.showCusomerInfo()+"지불금액은"+priceKim+"입니다.");

		Customer customerNo= new VIPCustomer(10030,"나몰라");
		customerNo.bonusPoint = 10000;
		System.out.println(customerNo.showCusomerInfo()+"지불금액은"+ customerNo.calcPrice(10000)+"원입니다.");
	}

}

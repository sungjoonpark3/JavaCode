package inheritance;

public class OverrideingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"�̼���");
		customerLee.bonusPoint = 1000;
	
		VIPCustomer customerKim = new VIPCustomer(10020,"������");
		customerKim.bonusPoint = 10000;
		
		int priceLee=customerLee.calcPrice(10000);
		int priceKim=customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCusomerInfo()+"���ұݾ���"+priceLee+"�Դϴ�.");
		System.out.println(customerKim.showCusomerInfo()+"���ұݾ���"+priceKim+"�Դϴ�.");

		Customer customerNo= new VIPCustomer(10030,"������");
		customerNo.bonusPoint = 10000;
		System.out.println(customerNo.showCusomerInfo()+"���ұݾ���"+ customerNo.calcPrice(10000)+"���Դϴ�.");
	}

}

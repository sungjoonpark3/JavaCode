package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
		
//		Customer customerLee = new Customer(10010,"�̼���");
//		customerLee.setCustomerName("�̼���");
//		customerLee.setCustomerID(10010);
//		customerLee.bonusPoint = 1000;
//		System.out.println(customerLee.showCusomerInfo());

		VIPCustomer customerKim = new VIPCustomer(10020,"������");
		customerKim.setCustomerName("������");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCusomerInfo());
	}

}

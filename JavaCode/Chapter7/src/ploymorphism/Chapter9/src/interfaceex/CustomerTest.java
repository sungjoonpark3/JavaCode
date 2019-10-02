package interfaceex;

public class CustomerTest {


	public static void main(String[] args) {
		//디폴트 메서드가 있다고 하더라도 구현된 메서드의 인스턴스를 사용해서 구현된다
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.sayHello();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();

		//다운캐스팅 형변환
		if(seller instanceof Customer) {}
	}

}

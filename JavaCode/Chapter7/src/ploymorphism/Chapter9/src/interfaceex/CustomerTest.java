package interfaceex;

public class CustomerTest {


	public static void main(String[] args) {
		//����Ʈ �޼��尡 �ִٰ� �ϴ��� ������ �޼����� �ν��Ͻ��� ����ؼ� �����ȴ�
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

		//�ٿ�ĳ���� ����ȯ
		if(seller instanceof Customer) {}
	}

}

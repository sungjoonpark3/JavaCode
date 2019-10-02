package interfaceex;

public class Customer implements Buy,Sell{

	@Override
	public void sell() {
		System.out.println("customer cell");
		
	}

	@Override
	public void buy() {
		System.out.println("customer buy");		
	}
	//중복되서 재정의한 부분
	@Override
	public void order() {
		System.out.println("customer order");
	}
	
	public void sayHello() {
		System.out.println("Hello");
		
	}
}

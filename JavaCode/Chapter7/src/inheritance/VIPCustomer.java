package inheritance;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	private int agentID;

//	public VIPCustomer() {
//		//private이므로 바로 접근이 불가능하다.->protected로 준다.
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		salesRatio = 0.1;
//		
//	}
	public VIPCustomer(int customerID, String customerName) {
		super(customerID,customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int,String)생성자 호출");	
	}
	
	//오버라이드 부분으 ㄹ지우면 에러 기존의 것과 다르기때문에 에러가 발생한다.
	@Override
	public int calcPrice(int price) {
		bonusPoint +=price*bonusRatio;
		return price- (int)(price*salesRatio);
		
	}
}

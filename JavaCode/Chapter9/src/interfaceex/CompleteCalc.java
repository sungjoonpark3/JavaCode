package interfaceex;

public class CompleteCalc extends Calculatro{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	//에러에따른 경우 처리 방법 참고
	@Override
	public int divide(int num1, int num2) {
			
		if(num2==0)
			return ERROR;
		else	
			return num1/num2;
	}

	public void shwoInfo() {
		System.out.println("모두구현되었습니다.");
	}
//	@Override
//	public void stringConcat(String s1, String s2) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void description() {
		System.out.print("재정의 한 description");
		
	}
	

}

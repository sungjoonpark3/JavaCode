package interfaceex;

public class CompleteCalc extends Calculatro{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	//���������� ��� ó�� ��� ����
	@Override
	public int divide(int num1, int num2) {
			
		if(num2==0)
			return ERROR;
		else	
			return num1/num2;
	}

	public void shwoInfo() {
		System.out.println("��α����Ǿ����ϴ�.");
	}
//	@Override
//	public void stringConcat(String s1, String s2) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void description() {
		System.out.print("������ �� description");
		
	}
	

}

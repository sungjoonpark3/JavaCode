package interfaceex;

public interface Calc {
	
	//������ �ܰ迡�� ����� �ȴ�.
	double PI = 3.14;
	int ERROR = -9999999;
	
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int times(int num1,int num2);
	int divide(int num1,int num2);
	
	//��ȯ������ ���� ������ �뷫���� ������ ���� �� �� ���� ��� �޼ҵ� �Ʒ��� ���� �ۼ�
	//	public void stringConcat(String s1,String s2);
	
	//����Ʈ�޼��� 
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
//		myMethod();
	}
	//static method
	//�������̽��� Ÿ������ �����ٰ� ��� �� �� �ֵ��� ����
	static int total(int[] arr) {
		int total=0;
		
		for(int i:arr) {
			total +=i;
		}
		return total;
	}
//�ڹ� 9���� ����� �����ϴ� �Ʒ��� ���� 	(private)
//	private void myMethod() {
//		System.out.println("private method");
//	}
//	
//	private static void mystaticMethod() {
//		System.out.println("private static mehtod");
//	}
	
}

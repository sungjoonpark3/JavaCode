package classpart;

public class FunctionTest {
	
	//���� ���� �ִ� ��� 
	public static int addNum(int num1,int num2) {
		int result;
		result = num1 + num2;
		return result;
		
	}
	
	public static int minNum(int num1,int num2) {
		int result;
		result = num1+num2;
		return result;
	}
	
	public static int mulNum(int num1,int num2) {
		int result;
		result= num1*num2;
		return result;
	}
	
	public static int nauNum(int num1,int num2) {
		int result;
		result = num1/num2;
		return result;
		
	}
	
	//���� ���� ���� ���
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	//���� ���� �ִ� ���
	public static int calcSum() {
		
		int sum=0;
		int i ; 
		for(i=0;i<=100;i++) {
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1,n2);
		
		sayHello("�ȳ��ϼ���");
		int num = calcSum();
		
		System.out.println(total);
		System.out.println(num);
		
		int nau=nauNum(n1,n2);
		int min=minNum(n1,n2);
		int mul=mulNum(n1,n2);
		System.out.println(nau);
		System.out.println(min);
		System.out.println(mul);
	}

}

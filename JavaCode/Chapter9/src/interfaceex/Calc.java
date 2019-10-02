package interfaceex;

public interface Calc {
	
	//컴파일 단계에서 상수가 된다.
	double PI = 3.14;
	int ERROR = -9999999;
	
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int times(int num1,int num2);
	int divide(int num1,int num2);
	
	//반환에대한 값의 구현을 대략적인 값들을 예쌍 할 수 있을 경우 메소드 아래와 같이 작성
	//	public void stringConcat(String s1,String s2);
	
	//디폴트메서드 
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
//		myMethod();
	}
	//static method
	//인터페이스의 타입으로 가져다가 사용 할 수 있도록 선언
	static int total(int[] arr) {
		int total=0;
		
		for(int i:arr) {
			total +=i;
		}
		return total;
	}
//자바 9부터 사용이 가능하다 아래와 같이 	(private)
//	private void myMethod() {
//		System.out.println("private method");
//	}
//	
//	private static void mystaticMethod() {
//		System.out.println("private static mehtod");
//	}
	
}

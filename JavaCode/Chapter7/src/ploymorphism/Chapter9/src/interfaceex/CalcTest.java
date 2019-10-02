package interfaceex;

public class CalcTest {

	public static void main(String[] args) {
		//생성자를 구현할 수 있는 것은  completeCalc만 가능하다 완벽구현되어있으므로
		
		CompleteCalc calc = new CompleteCalc();
		int n1=10;
		int n2=2;
		
		System.out.println(calc.add(n1,n2));
		System.out.println(calc.divide(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		
		
		calc.description();
		//static으로 선언한 경우 인스턴스화 하지 않고 바로 가져다가 아래 처럼 사용 할 수 있다.
		int[] arr = {1,2,3,4,5} ;
		int sum=Calc.total(arr);
		System.out.println(sum);

	}

}

package Chapter3;

public class OperatorEx4 {

	public static void main(String[] args) {
	
		int num1 = 10;
		int i =2 ;
		boolean value = ((num1 = num1+10)< 10) || ((i=i+2)<10);
		//값이 차이 발생 단순 회로평가
//		boolean value1 = ((num1 = num1+10)< 10) &&|| ((i=i+2)<10);
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println(value);
		
		int num2 = 10;
		int num3 = 20;
		
		//삼항연산자 관련된 부분ㄴ
		
		int max = (num2 > num3)?num2:num3;
		System.out.println(max);
		
	}

}

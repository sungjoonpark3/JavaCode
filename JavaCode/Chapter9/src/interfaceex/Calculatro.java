package interfaceex;

//부분적으로 선언하고 싶을때는 아래에 abstract 추가
//public abstractclass Calculatro implements Calc{
//인터페이스 내에 있는 것들 모두 선언해서 할떄는 아래와 같이 사용.
//public class Calculatro implements Calc{

public abstract class Calculatro implements Calc{

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
//구현 두개 완료 두개는 미완성->나머지 미완성은 다른 곳에서 구현하라고 뜬다.
	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}
}

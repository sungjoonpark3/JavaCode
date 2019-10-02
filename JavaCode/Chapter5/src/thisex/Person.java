package thisex;

public class Person {
	String name;
	int age;
	
	public Person() {
		//밑에 this가 있기 때문에 여기 초기값처럼 값을 넣어서 사용이 가능하다.
		this("이름없음",1);
		
	}
	
	public Person(String name,int age) {
		
		this.name=name;
		this.age=age;
	}
	
	public void showInfo(){
		System.out.println(name+","+age);		
	}
	
	public Person getSelf() {
		return this;
	}
}

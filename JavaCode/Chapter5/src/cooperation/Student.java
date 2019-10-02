package cooperation;

public class Student {
	
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName,int money) {
		this.studentName=studentName;
		this.money=money;
	}
	//버스라는 객체를 받고 그것을 밑에서 조작해서사용한다.
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	public void showInfo() {
		System.out.println(studentName+"님의 남은돈은"+money+"원입니다.");
	}
	
}

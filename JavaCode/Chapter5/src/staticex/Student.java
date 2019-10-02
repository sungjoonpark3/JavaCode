package staticex;


public class Student {
	
	private static int serialNum = 1000;
	private int studentID;
	public String studentName;
	public String address;

	//디폴트 생성자-프로그래머가 직접 선언해서 사용해도됨 
	public Student(String name) {
		studentName=name;
		serialNum++;
		studentID = serialNum;
	}
	//생성자구현-초기화 하고 싶을 경우 -디폴트 생성자가 제공되지 않도록 하려면 이렇게 선언
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "주소없음";
		serialNum++;
		studentID = serialNum;
	}
	public void showStudentInfo() {
		System.out.println(studentName+","+address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}
	public static int getSerialNum() {
		int i = 0;
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
}



package staticex;


public class Student {
	
	private static int serialNum = 1000;
	private int studentID;
	public String studentName;
	public String address;

	//����Ʈ ������-���α׷��Ӱ� ���� �����ؼ� ����ص��� 
	public Student(String name) {
		studentName=name;
		serialNum++;
		studentID = serialNum;
	}
	//�����ڱ���-�ʱ�ȭ �ϰ� ���� ��� -����Ʈ �����ڰ� �������� �ʵ��� �Ϸ��� �̷��� ����
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּҾ���";
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



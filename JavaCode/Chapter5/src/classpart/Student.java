package classpart;

public class Student {
	public int studentID;
	public String studentName;
	public String address;
	
//	public Student() {
//		//������
//	}
	//����Ʈ ������-���α׷��Ӱ� ���� �����ؼ� ����ص��� 
	public Student(String name) {
		studentName=name;
	}
	//�����ڱ���-�ʱ�ȭ �ϰ� ���� ��� -����Ʈ �����ڰ� �������� �ʵ��� �Ϸ��� �̷��� ����
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּҾ���";
	}
	public void showStudentInfo() {
		System.out.println(studentName+","+address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}



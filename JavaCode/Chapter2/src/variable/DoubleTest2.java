package variable;

public class DoubleTest2 {

	//�ε��Ҽ����� ���� ������ ��Ÿ�� �κ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double dNum=1;
		for(int i=0; i<10000;i++) {
			dNum=dNum+0.1;
		}
		System.out.println(dNum);
	}

}

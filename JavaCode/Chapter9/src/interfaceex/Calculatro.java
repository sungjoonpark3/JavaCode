package interfaceex;

//�κ������� �����ϰ� �������� �Ʒ��� abstract �߰�
//public abstractclass Calculatro implements Calc{
//�������̽� ���� �ִ� �͵� ��� �����ؼ� �ҋ��� �Ʒ��� ���� ���.
//public class Calculatro implements Calc{

public abstract class Calculatro implements Calc{

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
//���� �ΰ� �Ϸ� �ΰ��� �̿ϼ�->������ �̿ϼ��� �ٸ� ������ �����϶�� ���.
	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}
}

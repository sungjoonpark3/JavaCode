package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		//�ʱ�ȭ
//		int[] arr = new int[] {1,2,3};
		int total=0;
		int[] arr = new int[10];
		
		//�ڵ��ȿ� ���ں��� ������ �ڵ��ϱ�. �迭�� ũ���
		for(int i =0, num=1;i<arr.length;i++,num++) {
			arr[i] = num;
//			System.out.println(arr[i]);
		}
		
		for(int i =0; i<arr.length;i++){
			total += arr[i];
			
		}
		System.out.println(total);
		
	}

}

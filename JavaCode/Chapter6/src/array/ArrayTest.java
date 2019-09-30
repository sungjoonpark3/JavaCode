package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		//초기화
//		int[] arr = new int[] {1,2,3};
		int total=0;
		int[] arr = new int[10];
		
		//코딩안에 숫자보단 랭스로 코딩하기. 배열의 크기로
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

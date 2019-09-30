package array;
//기본 자료형의 복사
public class ArrayCopy {
	//기본 자료형의 복사
	public static void main(String[] args) {

		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = {1,2,3,4,5};
		//기본 자료형의 복사
		System.arraycopy(arr1, 0, arr2, 1, 3);
		
		for(int i =0;i<arr2.length;i++){
		System.out.println(arr2[i]);
		}
		
	}

}

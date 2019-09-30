package array;

public class TowDimension {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,4},{4,5,6,7}};
		
//		System.out.println(arr.length);//2
//		System.out.println(arr[0].length);//3
//		System.out.println(arr[1].length);//3
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2.length;j++)  {
				System.out.print(arr2[i][j]+" ");
			}
				System.out.println();
		}
	}

}

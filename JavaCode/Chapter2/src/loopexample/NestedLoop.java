package loopexample;

public class NestedLoop {
	public static void main(String[] args) {
		//2X3
		
		int dan;
		int count;
		
		for(dan = 2; dan <= 9 ; dan ++) {
			for(count = 1; count<=9;count++) {
				System.out.println(dan+"X"+count+"="+dan*count);
			}
			System.out.println();
		}
	}
}


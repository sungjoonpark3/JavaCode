package loopexample;

public class ForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		int sum=0;
		
		for(count=1;count<=10;count++) {
			sum+=count;
		}
		
		System.out.println(sum);
		
		int num=1;
		int total=0;
		while(num<=10) {
			total +=num;
			num++;
		}
		System.out.println(total);
	}

}

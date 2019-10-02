package Chapter4;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
	for(int i =1 ;i<10;i++) {
	int score = scanner.nextInt();
	char grade;
	
	if(score>=90 && score <=100) {
		System.out.println('A');
	}
	else if(score>=80 && score<=90) {
		System.out.println('B');
	}
	else if(score>=70 && score<=80) {
		System.out.println('C');
	}
	else if(score>=60 && score<=70) {
		System.out.println('D');
	}
	else 
	{
		System.out.println('F');
	}
	}
}
}

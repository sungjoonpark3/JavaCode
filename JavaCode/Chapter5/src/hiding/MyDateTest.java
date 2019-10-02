package hiding;

public class MyDateTest {

	public static void main(String[] args) {
	
		MyDate date = new MyDate();
		
		date.setYear(2019);
		date.setMonth(1);
		date.setDay(10);
		
		date.showDate();
		MyDate date2 = new MyDate();
		date2.setYear(2002);

	}

}

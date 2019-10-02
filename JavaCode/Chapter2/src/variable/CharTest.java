package variable;

public class CharTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		
		System.out.println(ch);
		System.out.println((int)(ch));
		
		int iCh=66;
		System.out.println((char)iCh);
		
		//음수 값은 들어갈 수 없다.char ch2=-66;
		
		char hangul = '\uAC00';
		System.out.println(hangul);
	}

}

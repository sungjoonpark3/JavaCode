package array;

import java.util.ArrayList;
//ArrayList사용방법 기초 
public class ArrayListTest {

	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		//일반적인 for문 버전
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		//향상된 for문 버전
		for(String s: list) {
			System.out.println(s);
		}

	}

}

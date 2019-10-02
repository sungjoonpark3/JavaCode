package thisex;

public class PersonTest {

	public static void main(String[] args) {

		Person personName = new Person();
		personName.showInfo();
		
		Person personLee = new Person("lee",10);
		personLee.showInfo();
		System.out.println(personLee);
		
		Person p = personLee.getSelf();
		System.out.println(p);

	}

}

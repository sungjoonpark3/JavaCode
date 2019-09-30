package ploymorphism;

import java.util.ArrayList;

class Animal{
	public void move() {	
		System.out.println("동물이 움직입니다.");
	}
	
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다. ");
	}
}

class Eagle extends Animal{
	public void movd() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		//Eagle human=(Eagle)hAnimal;
		//다운캐스팅관련
		//instanceof -> true/false 를 통해 진위여부 확인 -> 오브잭트 객체를 반환할때 확인용으로 사용하는 것이 안전한 코딩
		if(hAnimal instanceof Human) 
		{
			Human human = (Human)hAnimal;
			human.readBooks();
		}
		
		//다운캐스팅->
		Human human = (Human)hAnimal;
		human.readBooks();
		
		//다형성1
		AnimalTest test1 =new AnimalTest();
		test1.moveAnimal(hAnimal);
		test1.moveAnimal(tAnimal);
		test1.moveAnimal(eAnimal);
		
		//다형성2
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		
		for(Animal animal : animalList) {
			animal.move();
		}
	}
	//최상위 클래스를 자료형으로 넣어주면 된다.
	//장점-여러 클래스가 애니멀이라는 클래스 하나로 사용할 수 있다는 것이 장점이다. 클래스임과 동시에 애니멀
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i=0;i<list.size();i++) {
		Animal animal = list.get(i);
		
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.readBooks();
		}
		else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}
		else if(animal instanceof Eagle) {
			Eagle eagle = (Eagle)animal;
			eagle.flying();
		}
		else {
			System.out.println("ERROR");
		}
		}
		
	}
	
	//같은 메소드이지만 매개변수가 다른 오버로딩
	public void moveAnimal(Human animal) {}
}

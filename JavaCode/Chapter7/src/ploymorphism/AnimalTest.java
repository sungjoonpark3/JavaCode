package ploymorphism;

import java.util.ArrayList;

class Animal{
	public void move() {	
		System.out.println("������ �����Դϴ�.");
	}
	
}

class Human extends Animal{
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	public void readBooks() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �Ƚ��ϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�. ");
	}
}

class Eagle extends Animal{
	public void movd() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		//Eagle human=(Eagle)hAnimal;
		//�ٿ�ĳ���ð���
		//instanceof -> true/false �� ���� �������� Ȯ�� -> ������Ʈ ��ü�� ��ȯ�Ҷ� Ȯ�ο����� ����ϴ� ���� ������ �ڵ�
		if(hAnimal instanceof Human) 
		{
			Human human = (Human)hAnimal;
			human.readBooks();
		}
		
		//�ٿ�ĳ����->
		Human human = (Human)hAnimal;
		human.readBooks();
		
		//������1
		AnimalTest test1 =new AnimalTest();
		test1.moveAnimal(hAnimal);
		test1.moveAnimal(tAnimal);
		test1.moveAnimal(eAnimal);
		
		//������2
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
	//�ֻ��� Ŭ������ �ڷ������� �־��ָ� �ȴ�.
	//����-���� Ŭ������ �ִϸ��̶�� Ŭ���� �ϳ��� ����� �� �ִٴ� ���� �����̴�. Ŭ�����Ӱ� ���ÿ� �ִϸ�
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
	
	//���� �޼ҵ������� �Ű������� �ٸ� �����ε�
	public void moveAnimal(Human animal) {}
}

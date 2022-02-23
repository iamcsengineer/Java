class D{
	public static void main(String[] args){
		System.out.println("~~~~~ 1");
		
		Animal a = new Dog();

		Cat c = (Cat)a;

		System.out.println("~~~~~ 2");
	}
}

class Animal{ }
class Cat extends Animal{ }
class Dog extends Animal{ }
import java.util.*;

class Q{
	public static void main(String[] args){
		Cat cat = new Cat();
		pro(cat);

		Cow cow = new Cow();
		pro(cow);

		Dog dog = new Dog();
		pro(dog);
	}

	static void pro(Dog dog){
		System.out.println(dog);
	}

	static void pro(Cat cat){
		System.out.println(cat);
	}

	static void pro(Cow cow){
		System.out.println(cow);
	}
}

class Animal{ }

class Cat extends Animal{ }
class Dog extends Animal{ }
class Cow extends Animal{ }
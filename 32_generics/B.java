import java.util.ArrayList;

class B{
	public static void main(String[] args){
		Animal[] x = new Dog[2];
		x[0] = new Dog();
		x[1] = new Cow();
	}
}

class Animal{ }
class Dog extends Animal{ }
class Cat extends Animal{ }
class Cow extends Animal{ }
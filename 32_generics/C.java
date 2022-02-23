import java.util.ArrayList;

class B{
	public static void main(String[] args){
		ArrayList<Animal> x = new ArrayList<Dog>();
		x.add(new Dog());
		x.add(new Cow());
	}
}

class Animal{ }
class Dog extends Animal{ }
class Cat extends Animal{ }
class Cow extends Animal{ }
import java.util.*;

class Xx{
	public static void main(String[] args){
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(new BDog());
		list.add(new Dog());
		list.add(new Cat());
		list.add(new Cow());
		list.add(new Animal());
		//list.add(new Car());

		System.out.println(list);
	}
}

class Car{ }

class LivingBeing{ }
class Animal extends LivingBeing{ }
class Cat extends Animal{ }
class Cow extends Animal{ }
class Dog extends Animal{ }
class BDog extends Dog{ }
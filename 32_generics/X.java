import java.util.*;

class X{
	public static void main(String[] args){
		ArrayList<? super Dog> l1 = new ArrayList<LivingBeing>();
		ArrayList<? super Dog> l2 = new ArrayList<Animal>();
		ArrayList<? super Dog> l3 = new ArrayList<Dog>();
		
		//Case 3:
		//l3.add(new LivingBeing());
		//l3.add(new Animal());
		//l3.add(new Cow());
		//l3.add(new Cat());
		//l3.add(new Dog());
		//l3.add(new BDog());
		
		//Case 2:
		//l2.add(new LivingBeing());
		//l2.add(new Animal());
		//l2.add(new Cow());
		//l2.add(new Cat());
		//l2.add(new Dog());
		//l2.add(new BDog());

		//Case 1:
		//l1.add(new LivingBeing());
		//l1.add(new Animal());
		//l1.add(new Cow());
		//l1.add(new Cat());
		//l1.add(new Dog()); //OK
		//l1.add(new BDog()); //OK
	}
}

class LivingBeing{ }
class Animal extends LivingBeing{ }
class Cat extends Animal{ }
class Cow extends Animal{ }
class Dog extends Animal{ }
class BDog extends Dog{ }
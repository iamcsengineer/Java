import java.util.*;

class W{
	public static void main(String[] args){
		//ArrayList<? super Dog> list = new ArrayList<LivingBeing>();
		//ArrayList<? super Dog> list = new ArrayList<Animal>();
		//ArrayList<? super Dog> list = new ArrayList<Dog>();
		//ArrayList<? super Dog> list = new ArrayList<BDog>();
	}
}

class LivingBeing{ }
class Animal extends LivingBeing{ }
class Cat extends Animal{ }
class Cow extends Animal{ }
class Dog extends Animal{ }
class BDog extends Dog{ }
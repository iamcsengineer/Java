import java.util.*;

class T{
	public static void main(String[] args){
		ArrayList<? extends LivingBeing> list1 = new ArrayList<Cat>();
		ArrayList<? extends LivingBeing> list2 = new ArrayList<Cow>();
		ArrayList<? extends LivingBeing> list3 = new ArrayList<Dog>();
		ArrayList<? extends LivingBeing> list4 = new ArrayList<BDog>();
		ArrayList<? extends LivingBeing> list5 = new ArrayList<Animal>();
		ArrayList<? extends LivingBeing> list6 = new ArrayList<LivingBeing>();
	}
}

class LivingBeing{ }
class Animal extends LivingBeing{ }
class Cat extends Animal{ }
class Cow extends Animal{ }
class Dog extends Animal{ }
class BDog extends Dog{ }
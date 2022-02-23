class B{
	public static void main(String[] args){
		Animal r = new Animal();
		Dog d = new Dog();
		Cow w = new Cow();
		Cat t = new Cat();
		BDog e = new BDog();

		LivingBeing q = new BDog();

		//Animal a = d;
		//Animal a = w;
		//Animal a = t;
		//Animal a = e;
		//Animal a = (Animal)q;
		
		Animal[] x = {d,w,t,e,(Animal)q,r};		
	}
}

class LivingBeing{ }

class Animal extends LivingBeing{  }

class Cat extends Animal{ }
class Dog extends Animal{ }
class Cow extends Animal{ }

class BDog extends Dog{ }
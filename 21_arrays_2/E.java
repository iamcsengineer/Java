class E{
	public static void main(String[] args){
		Animal[] x = new Cat[2];

		x[0] = new Cat();
		x[1] = new Dog();
	}
}

class Animal{  }

class Cat extends Animal { }
class Cow extends Animal { }
class Dog extends Animal { }
class BDog extends Dog { }
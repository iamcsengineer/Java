class Animal{
	void makeSound(){
		System.out.println("Animal Sound");
	}
}

class Dog extends Animal{
	void makeSound(){
		System.out.println("Dog Sound ~");
	}
}

class BDog extends Dog{
	void makeSound(){
		System.out.println("BDog Sound");
	}
}

class Cow extends Animal{
	void makeSound(){
		System.out.println("Cow Sound ~");
	}
}

class Cat extends Animal{
	void makeSound(){
		System.out.println("Cat Sound ~");
	}
}

class G{
	public static void main(String[] args){
		Animal a = null;

		a = new Cat();
		a.makeSound();

		a = new Dog();
		a.makeSound();

		a = new Cow();
		a.makeSound();

		a = new Animal();
		a.makeSound();

		a = new BDog();
		a.makeSound();

		//Dynamic Method Dispatch
		//Runtime Polymorphism
	}
}
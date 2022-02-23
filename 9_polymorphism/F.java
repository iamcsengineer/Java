class Animal{
	void makeSound(){
		System.out.println("Animal Sound");
	}
}

class Dog extends Animal{
	void makeSound(){
		System.out.println("Dog Sound");
	}
}

class Cow extends Animal{
	void makeSound(){
		System.out.println("Cow Sound");
	}
}

class Cat extends Animal{
	void makeSound(){
		System.out.println("Cat Sound");
	}
}

class F{
	public static void main(String[] args){
		Cat c = new Cat();
		playSound(c);

		Cow w = new Cow();
		playSound(w);

		Dog g = new Dog();
		playSound(g);
	}

	static void playSound(Animal animal){
		animal.makeSound();
	}
	
	/*
	static void playSound(Dog dog){
		dog.makeSound();
	}

	static void playSound(Cow cow){
		cow.makeSound();
	}

	static void playSound(Cat cat){
		cat.makeSound();
	}*/
}
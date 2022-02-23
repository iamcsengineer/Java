class Animal{ }
class Cat extends Animal{ }
class Dog extends Animal{ }

class Bus{ }

class I{
	public static void main(String[] args){
		//Case 4:
		Animal a = new Cat();
		System.out.println(a instanceof Dog);


		//Case 3:
		//Animal a = new Animal();
		//System.out.println(a instanceof Bus);

		//Case 2:
		//Animal a = new Dog();
		//System.out.println(a instanceof Dog);

		//Case 1:
		//Animal a = new Cat();
		//System.out.println(a instanceof Animal);
		
	}
}
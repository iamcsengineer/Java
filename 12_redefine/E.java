class E{
	static void pro(Animal a){
		System.out.println("pro(Animal)");
	}

	static void pro(Dog d){
		System.out.println("pro(Dog)");
	}

	public static void main(String[] args){
		Animal x = new Dog();

		pro(x);
	}
}

class Animal{

}

class Dog extends Animal{

}
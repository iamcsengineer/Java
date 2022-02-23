class K{
	static void pro(Machine w){
		System.out.println("machine");
	}
	
	/*
	static void pro(LivingBeing w){
		System.out.println("LivingBeing");
	}

	
	static void pro(Animal w){
		System.out.println("Animal");
	}

	
	static void pro(Dog w){
		System.out.println("Dog");
	}

	
	static void pro(BDog w){
		System.out.println("BDog");
	}*/

	public static void main(String[] args){
		BDog a = new BDog();
		
		pro(a);
	}
}


class Machine{

}


class LivingBeing{

}

class Animal extends LivingBeing{

}

class Dog extends Animal{

}

class BDog extends Dog{

}
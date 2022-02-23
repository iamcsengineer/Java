class Animal
{
}

class Vehicle{

}

class Bus extends Vehicle{

}

class Car extends Vehicle{

}

class SportsCar extends Car{

}

class Z{
	public static void main(String[] args){
		Vehicle v = new SportsCar();
		
		//Case 2:
		if(v instanceof Animal){
			System.out.println("SportsCar is a  Animal");	
		}else{
			System.out.println("SportsCar is not a Animal");
		}

		//Case 1:
		/*
		if(v instanceof Bus){
			System.out.println("SportsCar is a  Bus");	
		}else{
			System.out.println("SportsCar is not a Bus");
		}*/
	}
}
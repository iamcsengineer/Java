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
		SportsCar sc = new SportsCar();
		
		//Case 5:
		/*
		if(sc instanceof Bus){
			System.out.println("SportsCar is a Bus");		
		}*/		

		//Case 4:
		/*
		if(sc instanceof Object){
			System.out.println("SportsCar is a Object");
		}*/

		//Case 3:
		/*
		if(sc instanceof Vehicle){
			System.out.println("SportsCar is a Vehicle");
		}*/

		//Case 2:
		/*
		if(sc instanceof Car){
			System.out.println("SportsCar is a Car");
		}*/

		//Case 1:
		/*
		if(sc instanceof SportsCar){
			System.out.println("SportsCar is a SportsCar");
		}*/
	}
}
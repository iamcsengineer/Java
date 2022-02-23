class Vehicle{

}

class Bus extends Vehicle{

}

class Car extends Vehicle{

}

class SportsCar extends Car{

}

class W{
	public static void main(String[] args){
		Object sc = new SportsCar();
		
		//Case 6:
		if(sc instanceof String){
			System.out.println("SportsCar is a String");			
		}else{
			System.out.println("SportsCar is not a String");			
		}

		//Case 5:
		/*
		if(sc instanceof Bus){
			System.out.println("SportsCar is a Bus");		
		}else{
			System.out.println("SportsCar is not a Bus");		
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
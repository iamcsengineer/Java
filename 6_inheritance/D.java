class Vehicle{

}

class Car extends Vehicle{

}

class SportsCar extends Car{

}

class D{
	public static void main(String[] args){
		SportsCar sc = new SportsCar();

		System.out.println(sc instanceof SportsCar);

		System.out.println(sc instanceof Car);

		System.out.println(sc instanceof Vehicle);

		System.out.println(sc instanceof Object);
	}
}
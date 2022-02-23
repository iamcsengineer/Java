interface Jumpable{
	void jump();
	void jumpingFactor();
}

class Car{

}

class SportsCar extends Car implements Jumpable {
	public void jump(){
		//---
	}

	public void jumpingFactor(){
		//---
	}
}



class Animal{

}

class Rabbit extends Animal implements Jumpable{
	public void jump(){
		//---
	}

	public void jumpingFactor(){
		//---
	}
}

class Toy{

}

class Ball extends Toy implements Jumpable{
	public void jump(){
		//---
	}

	public void jumpingFactor(){
		//---
	}
}
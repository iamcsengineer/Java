class Z4{
	<T> Z4(T t){
		System.out.println(t);
	}
	
	public static void main(String[] args){
		Z4 x = new Z4(new Bus());
		Z4 y = new Z4(new Animal());
	}
}

class Animal{ }
class Bus{ }
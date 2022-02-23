class Z3{
	public static void main(String[] args){
		Z3 x = new Z3();
		x.pro(new Car());
		x.pro(new Cat());
	}

	<T> void pro(T t){
		System.out.println(t);
	}
}

class Car{ }

class Cat{ }
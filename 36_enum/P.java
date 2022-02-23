class X{
	enum CoffeeSize{
		SMALL,MEDIUM,LARGE
	}
}

class P{
	public static void main(String[] args){
		//CoffeeSize cfz = CoffeeSize.SMALL;
		

		X x = new X();
		//X.CoffeeSize cfz = x.CoffeeSize.SMALL;
		X.CoffeeSize cfz = X.CoffeeSize.SMALL;

		System.out.println(cfz);
	}
}


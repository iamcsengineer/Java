class X{
	final int y = 90;
}

class N{
	public static void main(String[] args){
		X x = new X();

		System.out.println(x.y);

		x.y = 78;
	}
}
final class X{
	int y = 90;
}

class G{
	public static void main(String[] args){
		X x = new X();

		System.out.println(x.y);
		
		x.y = 56;
		
		System.out.println(x.y);
	}
}
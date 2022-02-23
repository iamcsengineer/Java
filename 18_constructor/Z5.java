abstract class Z5{
	int a = 89;
}

class X extends Z5{
	float t = 3.45f;

	public static void main(String[] args){
		X u = new X();

		System.out.println(u.t);
		System.out.println(u.a);
	}
}
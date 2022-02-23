abstract class Z6{
	int a = 89;

	Z6(){
		System.out.println(a);
		a = 777;
	}
}

class X extends Z6{
	float t = 3.45f;

	public static void main(String[] args){
		X u = new X();

		System.out.println(u.t);
		System.out.println(u.a);
	}
}
package a1.a2.a3; 

//import b1.b2.B;
//import b1.B;

class A{
	public static void main(String[] args){
		b1.b2.B b = new b1.b2.B();
		
		b1.B x = new b1.B();

		System.out.println(b.y);
		System.out.println(x.y);
	}
}
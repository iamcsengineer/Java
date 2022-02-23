class A{
	int a = 90;
	class B{
		int a = 91;
		class C{
			int a = 92;
			class D{
				int a = 93;
				void pro(){
					//System.out.println(a);
					//System.out.println(A.this.a);
					System.out.println(B.this.a);
				}
			}
		}
	}

	public static void main(String[] args){
		A a = new A();
		B b = a.new B();
		B.C c = b.new C();
		B.C.D d = c.new D();

		d.pro();
	}
}
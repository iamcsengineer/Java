class G{
	int a = 78;

	void pro(){
		System.out.println("Hello");
	}

	class X{

	}

	void abc(){
		System.out.println(a);
		System.out.println(this.a);
		pro();
		this.pro();
		X x = new X();
		X y = this.new X();
	}

	public static void main(String[] args){
		G g = new G();
		g.abc();
	}
}
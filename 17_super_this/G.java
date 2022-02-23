class X{
	void pro(){
		System.out.println("pro() in X");
	}
}

class Y extends X{
	void pro(){
		System.out.println("pro() in Y");
	}

	void abc(){
		pro();
		this.pro();
		super.pro();
	}
}

class G{
	public static void main(String[] args){
		Y y = new Y();
		
		y.abc();
	}
}
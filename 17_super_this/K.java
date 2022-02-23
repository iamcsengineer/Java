class X{
	static void abc(Y x){
		System.out.println(x);
	}
}

class Y{
	void pro(){
		System.out.println(this);
		X.abc(this);
	}
}

class K{
	public static void main(String[] args){
		Y y = new Y();
		System.out.println(y);
		y.pro();
	}
}
class T{
	static ThreadLocal tl = new ThreadLocal();

	public static void main(String[] args){
		String str = "mohan";

		tl.set(str);

		X.abc();		
	}
}

class X{
	static void abc(){
		Object obj = T.tl.get();

		String val = (String)obj;

		System.out.println(val+" ~~~~");

		Y.pqr();
	}
}

class Y{
	static void pqr(){
		System.out.println((String)T.tl.get()+" ###");   
	}
}
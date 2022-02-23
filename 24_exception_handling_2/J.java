//Case 4:
/*
class J{
	public static void main(String[] args){
		System.out.println("~~~~ main start");
		System.out.println(pro());
		System.out.println("~~~~ main end");
	}

	static int pro(){
		System.out.println("Hello");
		
		try{
			return 20/0;
		}catch(ArithmeticException e){
			e.printStackTrace();
		}finally{
			System.out.println("in finally");
		}

		return 23;
	}
}
*/

//Case 3:
/*
class J{
	public static void main(String[] args){
		System.out.println("~~~~ main start");
		System.out.println(pro());
		System.out.println("~~~~ main end");
	}

	static int pro(){
		System.out.println("Hello");
		
		try{
			return 20;
		}catch(ArithmeticException e){
			e.printStackTrace();
		}finally{
			System.out.println("in finally");
		}

		return 23;
	}
}
*/

//Case 2:
/*
class J{
	public static void main(String[] args){
		System.out.println("~~~~ main start");
		System.out.println(pro());
		System.out.println("~~~~ main end");
	}

	static int pro(){
		System.out.println("Hello");
		
		if(12<13){
			return 12;
			//System.out.println("hello");
		}

		return 23;
	}
}
*/

//Case 1:
/*
class J{
	public static void main(String[] args){
		System.out.println("~~~~ main start");
		System.out.println(pro());
		System.out.println("~~~~ main end");
	}

	static int pro(){
		System.out.println("Hello");
		return 12;
		//System.out.println("bye");
	}
}
*/
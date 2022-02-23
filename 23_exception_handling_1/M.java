class M{
	public static void main(String[] args){
		System.out.println("------- 1");
		
		
		System.out.println("------- 2");
		int x = 1;

		try{
			x = Integer.parseInt(args[0]);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		
		System.out.println("------- 3");
		int[] a = {12,34,45};

		try{
			System.out.println(a[x]);
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		
		System.out.println("------- 4");
		
		try{
			int w = 12/x;
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		
		System.out.println("------- 5");	
		

		System.out.println("------- 6");
	}
}
class O{
	public static void main(String[] args){
		System.out.println("------- 1");
		
		try{
			System.out.println("------- 2");
			int x = Integer.parseInt(args[0]);
			
			System.out.println("------- 3");
			int[] a = {12,34,45};
			System.out.println(a[x]);
			
			System.out.println("------- 4");
			int w = 12/x;
			
			System.out.println("------- 5");	
		}catch(NumberFormatException|ArrayIndexOutOfBoundsException e){
			System.out.println("#########");
		}catch(ArithmeticException e){
			System.out.println("!!!!!!!!!");
		}

		System.out.println("------- 6");
	}
}
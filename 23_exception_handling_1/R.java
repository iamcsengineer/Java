class R{
	public static void main(String[] args){
		
		int w = 2/0;
		
		try{
			int x = Integer.parseInt(args[0]);

			int y = 12/x;

			//System.out.println("Essential Code");
		}catch(ArithmeticException e){
			//System.out.println("Essential Code");
			e.printStackTrace();
		}catch(NumberFormatException e){
			//System.out.println("Essential Code");
			e.printStackTrace();
		}finally{
			System.out.println("Essential Code");
		}

		System.out.println("After try-catch");
	}
}
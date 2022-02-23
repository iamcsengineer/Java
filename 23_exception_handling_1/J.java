class J{
	public static void main(String[] args){
		System.out.println("~~~~~~ 1");
		
		try{
			int x = Integer.parseInt(args[0]);
			System.out.println("@@@@@@@@ "+x);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}
		

		System.out.println("~~~~~~ 2");
	}
}
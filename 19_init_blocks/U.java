class U{
	{
		System.out.println("object created");
	}

	public static void main(String[] args){
		System.out.println("---main start");
	
		{
			System.out.println(" ---- A");
		}
		
		System.out.println("###############");		
		U u1 = new U();
		U u2 = new U();
		System.out.println("###############");

		System.out.println("---main end");
	}
}
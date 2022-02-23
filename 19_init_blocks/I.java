class I{
	static{
		System.out.println("----- 7");	
	}

	{
		System.out.println("----- 2");	
	}

	static{
		System.out.println("----- 5");	
	}

	public static void main(String[] args){
		System.out.println("----- main start");	
		I h = new I();
		System.out.println("----- main end");
	}
}
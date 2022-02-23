class D{
	public static void main(String[] args){
		System.out.println(fact(6));
	}

	static int fact(int x){
		if(x==0)
			return 1;
		
		return x * fact(x-1);
	} 
}
class B{
	public static void main(String[] args){
		abc(2);	
	}

	static void abc(int x){
		if(x>=0){
			abc(x-1);
			System.out.println(x);
		}
	}
}
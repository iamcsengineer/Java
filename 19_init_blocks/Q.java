class Q{
	{
		System.out.println("Hello ~~");
	}

	Q(){
		//System.out.println("Hello");
		System.out.println("-----more code");
	}

	Q(int w){
		//System.out.println("Hello");
		System.out.println("-----Some other code");
	}

	public static void main(String[] args){
		Q q1 = new Q();
		Q q2 = new Q(12);
	}
}
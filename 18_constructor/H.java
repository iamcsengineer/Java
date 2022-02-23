class H{
	static int count;

	H(){
		count++;
	}

	public static void main(String[] args){
		H g1 = new H();
		System.out.println(g1.count);
		H g2 = new H();
		System.out.println(g2.count);
		H g3 = new H();
		System.out.println(g3.count);
		H g4 = new H();
		System.out.println(g4.count);
	}
}
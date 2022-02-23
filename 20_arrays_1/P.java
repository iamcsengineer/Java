class P{
	public static void main(String[] args){
		int[] x = new int[4];

		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
		
		x[0] = 12;
		x[1] = 123;
		x[2] = 51;
		x[3] = 13;
		System.out.println("############");
		
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}

		System.out.println("############");

		for(int tmp : x){
			System.out.println(tmp);
		}
	}
}
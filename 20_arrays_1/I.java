class I{
	public static void main(String[] args){
		int[] x = new int[3];

		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}

		x[0] = 12;
		x[1] = 23;
		x[2] = 99;

		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
	}
}
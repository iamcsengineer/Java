class P{
	public static void main(String[] args){
		int[][] x = new int[3][];

		x[0] = new int[2];
		x[1] = new int[5];
		x[2] = new int[3];
		
		System.out.println(x.length);
		System.out.println(x[0].length);
		System.out.println(x[1].length);
		System.out.println(x[2].length);
	}
}
class V{
	public static void main(String[] args){
		int[][] x = {{90,12},{78,23,45},{12}};

		for(int[] w : x){
			for(int y : w){
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}
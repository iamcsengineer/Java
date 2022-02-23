class R{
	public static void main(String[] args){
		int[][] x = new int[2][];

		x[0] = new int[3];
		x[1] = new int[4];


		//Case 2:
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print("i:"+i+"~j:"+j+"\t");
			}
			System.out.println("\n~~~~~~~");
		}

		//Case 1:
		/*
		for(int i=0;i<x.length;i++){
			//System.out.println(x[i]);
			System.out.println(x[i].length);
		}*/
	}
}
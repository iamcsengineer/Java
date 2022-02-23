class S{
	public static void main(String[] args){
		int[][] x = new int[][]{{12},{1,2,34},{45,56,34,56,78,90},{23,56,78,45}};
		//int[][] x = {{12,34,56},{1,2},{34,56,78,90}};

		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[i].length;j++){
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
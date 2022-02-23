class E{
	public static void main(String[] args){
		int len = Integer.parseInt(args[0]);
		
		for(int i=0;i<len;i++){
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}
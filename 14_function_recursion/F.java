class F{
	public static void main(String[] args){
		int len = Integer.parseInt(args[0]);
		
		printNewLine(len);
	}

	static void printNewLine(int x){
		if(x>0){
			printNewLine(x-1);
			printStar(x);
			System.out.println();			
		}
	}

	static void printStar(int y){
		if(y>0){
			System.out.print("# ");
			printStar(y-1);
		}
	}
}






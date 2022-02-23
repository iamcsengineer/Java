//Solution
class I{
	public static void main(String[] args){
		int[] x = {23,1,78,54};

		int[] y = new int[x.length];

		for(int i=0;i<x.length;i++){
			y[i] = x[x.length-i-1];
		}

		for(int i=0;i<y.length;i++){
			System.out.println(i+" ~~ "+y[i]);
		}

		System.out.println("~~~~~~~~~~~~~");

		for(int i=0;i<x.length;i++){
			System.out.println(i+" ~~ "+x[i]);
		}
	}
}

//Task
/*
class I{
	public static void main(String[] args){
		int[] x = {23,1,78,54};

		int[] y;
	}
}*/
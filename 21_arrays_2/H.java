//Solution:
class H{
	public static void main(String[] args){
		String[] x = {"mohan", "sohan", "rohan"};

		String[] y = new String[x.length];

		for(int i=0;i<y.length;i++){
			System.out.println(y[i]);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~");
		/*
		int j = 0;
		for(String str : x){
			y[j++] = str;
		}*/

		/*
		for(int i=0;i<x.length;i++){
			y[i] = x[i];
		}*/

		System.out.println("~~~~~~~~~~~~~~~~");

		for(int i=0;i<y.length;i++){
			System.out.println(y[i]);
		}
	}
}













//Task: (Assign an identical array to variable y)
/*
class H{
	public static void main(String[] args){
		String[] x = {"mohan", "sohan", "rohan"};

		String[] y;
	}
}*/
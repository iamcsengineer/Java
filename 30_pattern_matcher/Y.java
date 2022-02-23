class Y{
	public static void main(String[] args){
		//String str = "mohan is in class 12th";
		//String str = "mohan,ganesh,suresh,vivek";
		String str = "mohan-22,ganesh-23,vivek-8,rajiv-115,sateesh-34";

		//String[] x = str.split(" ");
		//String[] x = str.split(",");
		String[] x = str.split("\\d\\d");

		for(int i=0;i<x.length;i++){
			System.out.println(">"+x[i]+"<");
		}
	}
}
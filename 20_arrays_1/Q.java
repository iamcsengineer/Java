class Q{
	public static void main(String[] args){
		String[] x = new String[3];

		for(String tmp : x){
			System.out.println(tmp);
		}

		x[0] = "mohan";
		x[1] = "sohan";
		x[2] = "rohan";

		System.out.println("~~~~~~~~~");

		for(String tmp : x){
			System.out.println(tmp);
		}
	}
}
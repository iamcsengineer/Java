class U{
	public static void main(String[] args){
		String[][] x = {{"a1","a2","a3"},{"a11","a12"}};

		for(String[] a : x){
			//System.out.println(i);
			for(String b : a){
				System.out.print(b+"\t");
			}
			System.out.println();
		}
	}
}
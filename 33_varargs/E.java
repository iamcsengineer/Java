class E{
	public static void main(String[] args){
		//pro();
		//pro(12);
		//pro(12,34,56,78,90,2);

		int[] x = {12,34,56,11};
		pro(x);
	}

	static void pro(int... w){
		//System.out.println(w.length);
		for(int tmp : w){
			System.out.println(tmp);
		}
	}
}
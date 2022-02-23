class F{
	public static void main(String[] args){
		char[] w = new char[3];

		System.out.println(">"+w[0]+"<");
		System.out.println(">"+w[1]+"<");
		System.out.println(">"+w[2]+"<");
		
		w[0] = 'r';
		w[1] = 'a';
		w[2] = 'm';
		
		System.out.println(">"+w[0]+"<");
		System.out.println(">"+w[1]+"<");
		System.out.println(">"+w[2]+"<");
	}
}
class F{
	public static void main(String[] args){
		String a = new String("mohan");
		String b = new String("MOHAN");
		
		//Case 1:
		System.out.println(a.equals(b));
		
		//Case 2:
		System.out.println(a.equalsIgnoreCase(b));
	}
}
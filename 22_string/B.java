class B{
	public static void main(String[] args){
		String x = "mohan";

		String a1 = new String(x);
		String a2 = new String(x);
		String a3 = new String(x);

		System.out.println(a1==a2);
		System.out.println(a1==x);
		System.out.println(a2==x);
		System.out.println(a3==a2);
		System.out.println(a3==a1);
		System.out.println(a3==x);
	}
}
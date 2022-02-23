class E{
	public static void main(String[] args) throws ClassNotFoundException{
		Class c1 = Class.forName("E");

		E e = new E();
		Class c2 = e.getClass();

		Class c3 = E.class;

		System.out.println(c1==c2);
		System.out.println(c2==c3);
		System.out.println(c3==c1);
	}
}
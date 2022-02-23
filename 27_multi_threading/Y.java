class Y{
	static ThreadLocal tl = new ThreadLocal();
	
	public static void main(String[] args){
		System.out.println(tl.get());

		tl.set("aaa");
		System.out.println(tl.get());

		tl.remove();
		System.out.println(tl.get());
	}
}
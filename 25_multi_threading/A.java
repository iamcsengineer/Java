class A{
	public static void main(String[] args){
		Thread t = Thread.currentThread();

		System.out.println(t);
		System.out.println(t.getId());
		System.out.println(t.getPriority());
		System.out.println(t.getName());
	} 
}
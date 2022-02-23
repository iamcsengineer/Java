class N{
	public static void main(String[] args){
		Thread t = Thread.currentThread();

		System.out.println(t.getPriority());
		System.out.println(t.getName());

		t.setName("X");
		t.setPriority(Thread.MIN_PRIORITY);

		System.out.println("~~~~~~~~~");

		System.out.println(t.getPriority());
		System.out.println(t.getName());
	}
}
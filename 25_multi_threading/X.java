class X{
	public static void main(String[] args) throws InterruptedException{
		Thread t = Thread.currentThread();

		t.join();

		System.out.println(t.getName());
	}
}
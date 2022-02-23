class X{
	//static ThreadLocal tl = new ThreadLocal();
	static InheritableThreadLocal tl = new InheritableThreadLocal();

	public static void main(String[] args){
		tl.set(433);

		MyThread t = new MyThread();
		t.setName("A");
		t.start();
	}
}

class MyThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();

		System.out.println(t.getName()+" ---- "+X.tl.get());
	}
}
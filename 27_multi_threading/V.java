class V{
	public static void main(String[] args){		
		MyThread t1 = new MyThread();
		t1.x = 10;
		t1.setName("A");
		
		MyThread t2 = new MyThread();
		t2.x = 20;
		t2.setName("B");

		MyThread t3 = new MyThread();
		t3.x = 30;
		t3.setName("C");

		t1.start();
		t2.start();
		t3.start();
	}
}

class MyThread extends Thread{
	int x;
	static ThreadLocal tl = new ThreadLocal();
	
	public void run(){
		Thread t = Thread.currentThread();
		tl.set(x);

		try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}

		System.out.println(t.getName()+" ~~~ "+tl.get());
	}
}
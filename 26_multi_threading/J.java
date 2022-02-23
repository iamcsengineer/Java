class MyRunnable implements Runnable{
	public void run(){
		
	}
}

class J{
	public static void main(String[] args){
		ThreadGroup tg = new ThreadGroup("A");

		MyRunnable r = new MyRunnable();
		
		Thread t1 = new Thread(tg,r,"a1");
		Thread t2 = new Thread(tg,r,"a2");
		Thread t3 = new Thread(tg,r,"a3");

		t1.start();
		t2.start();
		t3.start();

		tg.list();

		ThreadGroup xg = Thread.currentThread().getThreadGroup().getParent();
		xg.list();
	}
}
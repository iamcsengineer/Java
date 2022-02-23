class MyRunnable implements Runnable{
	public void run(){
		try{Thread.sleep(2000);}catch(InterruptedException e){e.printStackTrace();}
	}
}

class K{
	public static void main(String[] args){
		ThreadGroup xg = Thread.currentThread().getThreadGroup().getParent();
		
		ThreadGroup tg = new ThreadGroup(xg,"A");

		MyRunnable r = new MyRunnable();
		
		Thread t1 = new Thread(tg,r,"a1");
		Thread t2 = new Thread(tg,r,"a2");
		Thread t3 = new Thread(tg,r,"a3");

		t1.start();
		t2.start();
		t3.start();

		//tg.list();

		System.out.println(xg.activeCount());
		xg.list();
	}
}
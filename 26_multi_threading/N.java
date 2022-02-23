class MyRunnable implements Runnable{
	public void run(){
		ThreadGroup tg = new ThreadGroup("B");
		System.out.println(tg.getParent().getName());
		try{Thread.sleep(2000);}catch(InterruptedException e){e.printStackTrace();}
	}
}

class N{
	public static void main(String[] args){
		ThreadGroup tg1 = new ThreadGroup("A");
		MyRunnable r = new MyRunnable();
		Thread t1 = new Thread(tg1,r,"a1");
		t1.start();

		ThreadGroup xg = tg1.getParent();

		System.out.println(xg.getName());
	}
}
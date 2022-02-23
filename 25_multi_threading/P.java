class MyRunnable implements Runnable{
	public void run(){
		Thread x = Thread.currentThread();

		for(int i=0;i<30;i++){
			System.out.println(i+" # "+x.getName());
		}
	}
}

class P{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();

		Thread t1 = new Thread(r,"A");
		Thread t2 = new Thread(r,"B");

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();

		Thread x = Thread.currentThread();

		for(int i=0;i<30;i++){
			System.out.println(i+" ~ "+x.getName());
		}
	}
}
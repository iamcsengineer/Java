class MyRunnable implements Runnable{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());

		t.setPriority(3);
		MyRunnable2 r = new MyRunnable2();
		Thread x = new Thread(r,"sohan");
		x.start();
	}
}

class MyRunnable2 implements Runnable{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
	}
}

class K{
	public static void main(String[] args){
		Thread x = Thread.currentThread();
		System.out.println(x.getPriority());
		x.setPriority(10);
		
		
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r,"mohan");
		t.start();
	}
}
class MyRunnable implements Runnable{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
	}
}

class J{
	public static void main(String[] args){
		Thread x = Thread.currentThread();		
		x.setPriority(7);
		System.out.println(x.getPriority());
		
		
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r,"mohan");
		t.start();
	}
}
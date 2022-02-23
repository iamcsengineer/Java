class MyThread2 extends Thread{
	public void run(){
		Thread x = Thread.currentThread();
		System.out.println(x.getName()+" ~~ "+x.isDaemon());
	}
}

class MyThread extends Thread{
	public void run(){
		MyThread2 t = new MyThread2();
		t.setName("Z");
		t.start();

		Thread x = Thread.currentThread();
		System.out.println(x.getName()+" ~~ "+x.isDaemon());
	}
}

class B{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.setName("A");
		t.setDaemon(true);
		t.start();	
		
		Thread x = Thread.currentThread();
		System.out.println(x.getName()+" ~~ "+x.isDaemon());
	}
}
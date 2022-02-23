class MyThread extends Thread{
	public void run(){
		//
	}
}

class C{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.setName("A");		
		t.start();	
		t.setDaemon(true);
		
		Thread x = Thread.currentThread();
		System.out.println(x.getName()+" ~~ "+x.isDaemon());
	}
}
class U{
	static ThreadLocal tl = new ThreadLocal();
	
	public static void main(String[] args){
		tl.set("mohan");
		
		MyThread t = new MyThread();
		t.setName("A");
		
		//Case 1:
		//t.start();
		
		//Case 2:
		//t.run();
	}
}

class MyThread extends Thread{
	public void run(){
		Thread x = Thread.currentThread();

		System.out.println(x.getName()+" ~~~ "+U.tl.get());
	}
}
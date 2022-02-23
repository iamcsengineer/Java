class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());
	}
}

class F{
	public static void main(String[] args){		
		MyThread x = new MyThread();
		x.setName("A");
		x.start();
		
		Thread t = Thread.currentThread();
		ThreadGroup tg = t.getThreadGroup();
		
		System.out.println(t);
		//System.out.println("Thread Name: "+t.getName());
		//System.out.println("Thread Group Name: "+tg.getName());

		//tg.list();
	}	
}
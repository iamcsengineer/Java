class MyRunnable2 implements Runnable{
	public void run(){
		Thread t = Thread.currentThread();

		for(int i=0;i<10;i++){
			System.out.println(i+" ~ "+t.getName());
		}
	}
}

class MyRunnable implements Runnable{
	public void run(){
		Thread x = new Thread(new MyRunnable2(),"B");
		x.start();

		try{x.join();}catch(InterruptedException e){e.printStackTrace();}

		Thread t = Thread.currentThread();

		for(int i=0;i<10;i++){
			System.out.println(i+" ~ "+t.getName());
		}
	}
}

class U{
	public static void main(String[] args) throws InterruptedException{
		Thread x = new Thread(new MyRunnable(),"A");
		x.start();
		
		
		x.join();

		Thread t = Thread.currentThread();

		for(int i=0;i<10;i++){		
			System.out.println(i+" ~ "+t.getName());
		}
	}
}
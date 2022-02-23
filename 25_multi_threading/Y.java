class MyRunnable implements Runnable{
	public void run(){
		Thread t = Thread.currentThread();

		for(int i=0;i<300;i++){
			System.out.println(i+" ~ "+t.getName());
		}
	}
}

class Y{
	public static void main(String[] args) throws InterruptedException{
		Thread x = new Thread(new MyRunnable(),"A");
		x.start();		
		x.join(100);

		Thread t = Thread.currentThread();

		for(int i=0;i<100;i++){		
			System.out.println(i+" ~ "+t.getName());
		}
	}
}
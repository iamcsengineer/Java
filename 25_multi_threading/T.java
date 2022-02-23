class MyRunnable implements Runnable{
	public void run(){
		Thread t = Thread.currentThread();

		for(int i=0;i<100;i++){
			System.out.println(i+" ~ "+t.getName());
		}
	}
}

class T{
	public static void main(String[] args) throws InterruptedException{
		Thread x = new Thread(new MyRunnable(),"A");
		x.start();
		
		//Case 2:
		x.join();

		Thread t = Thread.currentThread();

		for(int i=0;i<10;i++){
			//Case 1:
			/*
			if(i==5){
				x.join();
			}*/
			System.out.println(i+" ~ "+t.getName());
		}
	}
}
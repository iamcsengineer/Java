class MyRunnable implements Runnable{
	public void run(){
		Thread t = Thread.currentThread();
		for(int i=0;i<30;i++){
			System.out.println(i+" ~ "+t.getName());
		}
	}
}

class Q{
	public static void main(String[] args){
		Thread x = new Thread(new MyRunnable(),"A");
		x.start();
		
		try{
			//x.sleep(5000);
			Thread.sleep(5000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}

		Thread t = Thread.currentThread();
		for(int i=0;i<30;i++){
			System.out.println(i+" ~ "+t.getName());
		}
	}
}
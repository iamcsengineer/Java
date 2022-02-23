class MyRunnable implements Runnable{
	public void run(){
		String threadName = Thread.currentThread().getName();

		for(int i=0;i<30;i++){
			System.out.println(i+" ~ "+threadName);
		}
	}
}

class G{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();

		String threadName = Thread.currentThread().getName();

		for(int i=0;i<30;i++){
			System.out.println(i+" $ "+threadName);
		}
	}
}
import java.util.concurrent.locks.ReentrantLock;

class MyThread extends Thread{
	static ReentrantLock rlock = new ReentrantLock();	

	public void run(){
		Thread x = Thread.currentThread();

		if(rlock.tryLock()){
			System.out.println(x.getName()+" got the lock....");	
			try{Thread.sleep(500);}catch(InterruptedException e){e.printStackTrace();}
			System.out.println(x.getName()+" going to release the lock....");	
			rlock.unlock();
		}else{
			System.out.println(x.getName()+" didn't get the lock....");	
		}
	}
}

class L{
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		t1.setName("A");
		
		MyThread t2 = new MyThread();
		t2.setName("B");

		t1.start();
		t2.start();
	}
}
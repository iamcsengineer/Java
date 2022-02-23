import java.util.concurrent.locks.ReentrantLock;

class MyThread extends Thread{
	
	MyThread(String name){
		super(name);
	}

	public void run(){
		Thread x = Thread.currentThread();
		
		System.out.println(x.getName()+" ~~~~~~ is going to acquire the lock");

		Q.rlock.lock();

		System.out.println(x.getName()+" ~~~~~~ got the lock");

		try{Thread.sleep(50);}catch(InterruptedException e){e.printStackTrace();}

		Q.rlock.unlock();

		System.out.println(x.getName()+" ~~~~~~ released the lock");
	}
}

class Q{
	static ReentrantLock rlock = new ReentrantLock();
	
	public static void main(String[] args){		
		rlock.lock();
		
		System.out.println(rlock.getQueueLength());

		new MyThread("A").start();
		new MyThread("B").start();
		new MyThread("C").start();

		try{Thread.sleep(100);}catch(InterruptedException e){e.printStackTrace();}
		
		System.out.println(rlock.getQueueLength());

		rlock.unlock();	

		try{Thread.sleep(100);}catch(InterruptedException e){e.printStackTrace();}

		System.out.println(rlock.getQueueLength());
	}
}
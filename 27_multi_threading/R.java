import java.util.concurrent.locks.ReentrantLock;

import java.util.Collection;

class MyThread extends Thread{
	
	MyThread(String name){
		super(name);
	}

	public void run(){
		Thread x = Thread.currentThread();
		
		System.out.println(x.getName()+" ~~~~~~ is going to acquire the lock");

		R.rlock.lock();

		System.out.println(x.getName()+" ~~~~~~ got the lock");

		try{Thread.sleep(50);}catch(InterruptedException e){e.printStackTrace();}

		R.rlock.unlock();

		System.out.println(x.getName()+" ~~~~~~ released the lock");
	}
}

class R{
	static ReentrantLock rlock = new ReentrantLock();
	
	public static void main(String[] args){		
		rlock.lock();
		
		System.out.println(rlock.getQueueLength());

		new MyThread("A").start();
		new MyThread("B").start();
		new MyThread("C").start();

		try{Thread.sleep(100);}catch(InterruptedException e){e.printStackTrace();}
		
		
		System.out.println(rlock.hasQueuedThreads());
		System.out.println(rlock.getQueueLength());
		
		/*
		Collection threads = rlock.getQueuedThreads();	

		for(Thread t : threads){
			System.out.println(t.getName()+" is part of the queue");
		}*/

		rlock.unlock();	

		try{Thread.sleep(100);}catch(InterruptedException e){e.printStackTrace();}

		System.out.println(rlock.getQueueLength());
	}
}
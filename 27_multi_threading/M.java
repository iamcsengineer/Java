import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

class MyThread extends Thread{
	static ReentrantLock rlock = new ReentrantLock();	

	public void run(){
		Thread x = Thread.currentThread();
		
		try{
			do{
				if(rlock.tryLock(5000,TimeUnit.MILLISECONDS)){
					System.out.println(x.getName()+" got the lock....");	
					Thread.sleep(20000);
					System.out.println(x.getName()+" going to release the lock....");	
					rlock.unlock();
					break;
				}else{
					System.out.println(x.getName()+" didn't get the lock....");	
				}
			}while(true);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

class M{
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		t1.setName("A");
		
		MyThread t2 = new MyThread();
		t2.setName("B");

		t1.start();
		t2.start();
	}
}
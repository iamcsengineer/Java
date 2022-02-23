import java.util.concurrent.locks.ReentrantLock;

class Greet{
	ReentrantLock rlock = new ReentrantLock();

	void print(String name,String msg){
		rlock.lock();
		for(int i=0;i<5;i++){
			System.out.print(msg+" : ");
			try{Thread.sleep(100);}catch(InterruptedException e){ e.printStackTrace();}
			System.out.println(name);		
		}
		rlock.unlock();
	}
}

class MyThread extends Thread{
	String name;
	String msg;

	MyThread(String name,String msg){
		this.name = name;
		this.msg = msg;
	}
	
	public void run(){
		K.greet.print(name,msg);
	}
}

class K{
	static Greet greet = new Greet();
	
	public static void main(String[] args){
		new MyThread("Ganesh","Hello").start();
		new MyThread("Mohan","Bye").start();
	}
}
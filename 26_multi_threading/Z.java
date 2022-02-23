class A{
	void abc(){
		Thread x = Thread.currentThread();
		synchronized(this){
			for(int i=0;i<10;i++){
				System.out.println(i+" ~ "+x.getName());
			}
		}	
	}

	void pqr(){
		Thread x = Thread.currentThread();
		synchronized(this){	
			for(int i=0;i<10;i++){
				System.out.println(i+" @ "+x.getName());
			}
		}
	}
}

class Z{
	static A a = new A();
	public static void main(String[] args){
		new Thread(new MyRunnable1(),"A").start();
		new Thread(new MyRunnable2(),"B").start();
	}
}

class MyRunnable1 implements Runnable{
	public void run(){
		Z.a.abc();
	}
}

class MyRunnable2 implements Runnable{
	public void run(){
		Z.a.pqr();
	}
}
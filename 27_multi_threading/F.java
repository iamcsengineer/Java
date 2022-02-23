class X{
	synchronized static void abc(){
		Thread x = Thread.currentThread();
		for(int i=0;i<10;i++){
			System.out.println(i+" ~ "+x.getName());
		}
	} 
}

class F{
	public static void main(String[] args){
		new Thread(new MyRunnable1(),"A").start();
		new Thread(new MyRunnable2(),"B").start();
	}
}

class MyRunnable2 implements Runnable {
	public void run(){
		synchronized(X.class){
			Thread x = Thread.currentThread();
			for(int i=0;i<10;i++){
				System.out.println(i+" ~ "+x.getName());
			}	
		}
	}
}

class MyRunnable1 implements Runnable{
	public void run(){
		X.abc();
	}
}
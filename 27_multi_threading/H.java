class MyRunnable1 implements Runnable{
	public void run(){
		synchronized(H.u){
			try{Thread.sleep(50);}catch(InterruptedException e){e.printStackTrace();}
			synchronized(H.v){
			
			}
		}
	}
}

class MyRunnable2 implements Runnable{
	public void run(){
		synchronized(H.v){
			try{Thread.sleep(50);}catch(InterruptedException e){e.printStackTrace();}
			synchronized(H.u){
			
			}
		}
	}
}

class H{
	static U u = new U();
	static V v = new V();

	public static void main(String[] args){
		new Thread(new MyRunnable1(),"P").start();
		new Thread(new MyRunnable2(),"Q").start();
	}
}

class U{ }
class V{ }
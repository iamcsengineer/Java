class X{
	void abc(){
		Thread x = Thread.currentThread();
		for(int i=0;i<10;i++){
			System.out.println(i+" ~ "+x.getName());
		}
	}

	void pqr(){
		Thread x = Thread.currentThread();
		for(int i=0;i<10;i++){
			System.out.println(i+" ~ "+x.getName());
		}
	}
}

class R{
	static X x = new X();

	public static void main(String[] args){
		MyRunnable1 r1 = new MyRunnable1();
		MyRunnable2 r2 = new MyRunnable2();

		Thread t1 = new Thread(r1,"A");
		Thread t2 = new Thread(r2,"B");

		t1.start();
		t2.start();
	}
}

class MyRunnable1 implements Runnable{
	public void run(){
		R.x.abc();	
	}
}

class MyRunnable2 implements Runnable{
	public void run(){
		R.x.pqr();
	}
}
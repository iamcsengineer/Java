class A{
	synchronized void abc(){
		try{Thread.sleep(50);}catch(InterruptedException e){e.printStackTrace();}
		G.b.mno();
		System.out.println("~~~~~~~~~~~~~~~~~~");
	}
}

class B{ 
	synchronized void mno(){
		try{Thread.sleep(50);}catch(InterruptedException e){e.printStackTrace();}
		G.a.abc();
		System.out.println("%%%%%%%%%%%%%%%%%%%%");
	}
}

class MyRunnable1 implements Runnable{
	public void run(){
		G.a.abc();
	}
}

class MyRunnable2 implements Runnable{
	public void run(){
		G.b.mno();
	}
}

class G{
	static A a = new A();
	static B b = new B();

	public static void main(String[] args){
		new Thread(new MyRunnable1(),"X").start();
		new Thread(new MyRunnable2(),"Y").start();
	}
}



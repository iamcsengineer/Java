class Circle{
	private int radius;

	synchronized void readRadius(){
		Thread x = Thread.currentThread();

		if(radius!=0){
			System.out.println(x.getName()+" is going to read the radius: "+radius);	
			radius = 0;
			notify();
		}else{
			try{wait();}catch(InterruptedException e){e.printStackTrace();}
		}
	}

	synchronized void writeRadius(){
		Thread x = Thread.currentThread();

		if(radius==0){
			System.out.println(x.getName()+" is going to write the radius: ");	
			radius = Integer.parseInt(System.console().readLine());
			notify();
		}else{
			try{wait();}catch(InterruptedException e){e.printStackTrace();}
		}
	}
}

class MyRunnable1 implements Runnable{
	public void run(){
		while(true){
			I.c.writeRadius();
		}
	}
}

class MyRunnable2 implements Runnable{
	public void run(){
		while(true){
			I.c.readRadius();
		}
	}
}

class I{
	static Circle c = new Circle();
	
	public static void main(String[] args){
		new Thread(new MyRunnable1(),"Producer").start();
		new Thread(new MyRunnable2(),"Consumer").start();
	}
}
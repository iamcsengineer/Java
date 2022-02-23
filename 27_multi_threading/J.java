class Greet{
	synchronized void print(String name,String msg){
		System.out.print(msg+" : ");
		try{Thread.sleep(100);}catch(InterruptedException e){ e.printStackTrace();}
		System.out.println(name);		
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
		for(int i=0;i<5;i++){
			J.greet.print(name,msg);
		}
	}
}

class J{
	static Greet greet = new Greet();
	public static void main(String[] args){
		new MyThread("Ganesh","Hello").start();
		new MyThread("Mohan","Bye").start();
	}
}
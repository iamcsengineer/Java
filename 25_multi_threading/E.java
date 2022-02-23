class MyThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println("run "+t.getName());
	}
}

class E{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.setName("abc");

		//t.start();
		//t.run();

		Thread x = Thread.currentThread();
		System.out.println(x.getName());
	}
}
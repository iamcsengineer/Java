class MyThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		t.setName("mohan");
		System.out.println(t.getName());
	}
}

class B{
	public static void main(String[] args){
		MyThread t = new MyThread();

		t.start();

		Thread x = Thread.currentThread();
		System.out.println(x.getName());
	}
}
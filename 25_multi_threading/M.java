class MyThread extends Thread {
	public void run(){
		Thread t = Thread.currentThread();

		System.out.println(t.getName());
		System.out.println(t.getPriority());
	}
}

class M{
	public static void main(String[] args){
		MyThread x = new MyThread();

		x.setName("A");
		//x.setPriority(10);
		x.setPriority(Thread.MAX_PRIORITY);

		x.start();
	}
}
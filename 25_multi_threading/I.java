class MyRunnable implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}

class I{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();

		Thread t1 = new Thread(r,"golu");
		Thread t2 = new Thread(r,"bholu");
		Thread t3 = new Thread(r,"dholu");

		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println("~~~~~~~~~~~~~");	
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
		System.out.println("~~~~~~~~~~~~~");
		System.out.println(t3.getId());
		System.out.println(t3.getName());
		System.out.println(t3.getPriority());
	}
}
class MyThread extends Thread{
	public void run(){
		Thread x = Thread.currentThread();

		for(int i=0;i<300;i++){
			System.out.println(i+" ~ "+x.getName());
		}
	}
}

class A{
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		t1.setName("A");
		//t1.setDaemon(true);
		t1.start();


		Thread x = Thread.currentThread();

		for(int i=0;i<20;i++){
			System.out.println(i+" ~ "+x.getName());
		}
	}
}
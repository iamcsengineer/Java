class MyThread1 extends Thread{
	public void run() /*throws InterruptedException*/{
		MyThread2 t = new MyThread2();
		t.setName("B");
		t.start();

		Thread x = Thread.currentThread();
		for(int i=0;i<10;i++){
			if(i==5){
				try{ Thread.sleep(10000);}catch(InterruptedException e){ e.printStackTrace();}
			}
			System.out.println(i+" ~ "+x.getName());
		}
	}
}

class MyThread2 extends Thread{
	public void run(){
		Thread x = Thread.currentThread();
		for(int i=0;i<10;i++){
			System.out.println(i+" ~ "+x.getName());
		}
	}
}

class R{
	public static void main(String[] args) throws InterruptedException{
		MyThread1 t = new MyThread1();
		t.setName("A");
		t.start();

		Thread x = Thread.currentThread();
		for(int i=0;i<10;i++){
			if(i==5){
				Thread.sleep(10000);
			}
			System.out.println(i+" ~ "+x.getName());
		}
	}
}
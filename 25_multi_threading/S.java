class MyThread extends Thread{
	public void run(){
		Thread x = Thread.currentThread();

		for(int i=0;i<100;i++){
			System.out.println(i+" ~ "+x.getName());
		}
	}
}

class S{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.setName("A");

		t.start();

		Thread x = Thread.currentThread();
		x.setPriority(10);
		for(int i=0;i<100;i++){			
			if(i>=12&&i<=15){
				System.out.println(i+" # "+x.getName()+" is going to yield");
				Thread.yield();
			}
			System.out.println(i+" ~ "+x.getName());
		}
	}
}
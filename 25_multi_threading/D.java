class MyThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		
		for(int i=0;i<30;i++){
			System.out.println(i+" ~ "+t.getName());
		}
	}
}

class D{
	public static void main(String[] args){
		MyThread x1 = new MyThread();
		x1.setName("mohan");

		MyThread x2 = new MyThread();
		x2.setName("gaurav");

		x1.start();
		x2.start();

		Thread t = Thread.currentThread();

		for(int i=0;i<30;i++){
			System.out.println(i+" # "+t.getName());
		}
	}
}
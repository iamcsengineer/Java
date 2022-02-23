class MyThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		t.setName("mohan");
		
		for(int i=0;i<100;i++){
			System.out.println(i+"~"+t.getName());
		}
	}
}

class C{
	public static void main(String[] args){
		MyThread t = new MyThread();

		t.start();

		Thread x = Thread.currentThread();
		
		for(int i=0;i<100;i++){
			System.out.println(i+"~"+x.getName());
		}
	}
}
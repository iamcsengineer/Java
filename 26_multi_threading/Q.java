class Account{
	String acType = "Sv";
	String acNum = "23456";
	private int balance = 50;

	synchronized int getBalance(){
		return balance;
	}

	synchronized void withdraw(int amt){
		if(amt<=balance){
			try{Thread.sleep(10);}catch(InterruptedException e){e.printStackTrace();}
			balance = balance - amt;
		}		
	}
}

class MyRunnable implements Runnable{
	public void run(){
		Thread x = Thread.currentThread();
		for(int i=0;i<5;i++){
			System.out.println(i+" ~ "+x.getName()+" is going to withdraw ....");
			
			Q.a.withdraw(10);
			System.out.println(i+" ~ "+x.getName()+" balance is: "+Q.a.getBalance());
		}
	}
}

class Q{
	static Account a = new Account();

	public static void main(String[] args){
		MyRunnable r = new MyRunnable();

		Thread t1 = new Thread(r,"Mohan");
		Thread t2 = new Thread(r,"Sohan");

		t1.start();
		t2.start();
	}
}
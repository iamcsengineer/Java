class Account{
	String acType = "Sv";
	String acNum = "23456";
	int balance = 50;

	int getBalance(){
		return balance;
	}

	void withdraw(int amt){
		balance = balance - amt;
	}
}

class MyRunnable implements Runnable{
	public void run(){
		Thread x = Thread.currentThread();
		for(int i=0;i<5;i++){
			System.out.println(i+" ~ "+x.getName()+" is going to withdraw ....");
			try{Thread.sleep(200);}catch(InterruptedException e){e.printStackTrace();}
			O.a.withdraw(10);
			System.out.println(i+" ~ "+x.getName()+" balance is: "+O.a.getBalance());
		}
	}
}

class O{
	static Account a = new Account();

	public static void main(String[] args){
		MyRunnable r = new MyRunnable();

		Thread t1 = new Thread(r,"Mohan");
		Thread t2 = new Thread(r,"Sohan");

		t1.start();
		t2.start();
	}
}
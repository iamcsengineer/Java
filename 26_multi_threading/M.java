class MyRunnable implements Runnable{
	public void run(){
		try{Thread.sleep(2000);}catch(InterruptedException e){e.printStackTrace();}
	}
}

class M{
	public static void main(String[] args){
		ThreadGroup tg1 = new ThreadGroup("A");

		ThreadGroup xg = tg1.getParent();

		System.out.println(xg.getName());
	}
}
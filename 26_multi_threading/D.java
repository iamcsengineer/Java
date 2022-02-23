class D{
	public static void main(String[] args){		
		Thread t = Thread.currentThread();
		ThreadGroup tg = t.getThreadGroup();
		
		System.out.println("Thread Name: "+t.getName());
		System.out.println("Thread Group Name: "+tg.getName());
	}	
}
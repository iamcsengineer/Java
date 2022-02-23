class G{
	public static void main(String[] args){			
		Thread t = Thread.currentThread();
		ThreadGroup tg1 = t.getThreadGroup();
		ThreadGroup tg2 = tg1.getParent();
		
		
		System.out.println("Thread Name: "+t.getName());
		System.out.println("Thread Group Name: "+tg1.getName());
		System.out.println("Thread Group Parent Name: "+tg2.getName());
	}	
}
class L{
	public static void main(String[] args){
		ThreadGroup tg = Thread.currentThread().getThreadGroup().getParent();

		int activeCount = tg.activeCount();

		Thread[] arr = new Thread[activeCount];

		System.out.println(tg.enumerate(arr));

		for(Thread t : arr){
			//System.out.println(t);
			System.out.println(t.getName()+" ~ "+t.isDaemon());
		}
	}
}
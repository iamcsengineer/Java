class Z2{
	static InheritableThreadLocalSub tl = new InheritableThreadLocalSub();

	public static void main(String[] args){	
		System.out.println(Thread.currentThread().getName()+" ~~~ "+tl.get());
		
		MyThread t = new MyThread();
		t.setName("A");
		t.start();
	}
}

class MyThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();

		System.out.println(t.getName()+" ~~~ "+Z2.tl.get());
	}
}

class InheritableThreadLocalSub extends InheritableThreadLocal{
	public Object initialValue(){
		return "aaa";
	}

	public Object childValue(Object parentValue){
		return "bbb";
	}
}
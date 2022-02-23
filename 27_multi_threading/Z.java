class Z{
	//static ThreadLocal tl = new ThreadLocal();
	static ThreadLocalSub tl = new ThreadLocalSub();
	
	public static void main(String[] args){
		System.out.println(tl.get());

		tl.set("aaa");
		System.out.println(tl.get());

		tl.remove();
		System.out.println(tl.get());
	}
}

class ThreadLocalSub extends ThreadLocal{
	public Object initialValue(){
		return "qqq";
	}
}
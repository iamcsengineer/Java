class T{
	{
		System.out.println("-----inst init block");
	}

	T(){
		System.out.println("-----T()");
	}

	public static void main(String[] args){
		System.out.println("-----main start");
		T t = new T();
		System.out.println("-----main end");
	}
}
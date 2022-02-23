class B{
	public static void main(String[] args){
		Class klass = null;
		try{
			//klass = Class.forName("B");
			//klass = Class.forName("C");
			klass = Class.forName("A");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}

		System.out.println(klass);
	}
}
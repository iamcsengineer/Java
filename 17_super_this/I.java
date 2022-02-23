class I{
	void pro(){
		System.out.println(this);
	}

	public static void main(String[] args){
		I i1 = new I();
		System.out.println(i1);

		i1.pro();

		I i2 = new I();
		System.out.println(i2);

		i2.pro();
	}
}
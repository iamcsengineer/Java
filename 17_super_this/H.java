class H{
	void pro(){
		System.out.println(this);
	}

	public static void main(String[] args){
		H h = new H();
		System.out.println(h);

		h.pro();
	}
}
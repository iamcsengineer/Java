class J{
	int y = 90;

	void pro(){
		System.out.println(y);
		System.out.println(this.y);
	}

	public static void main(String[] args){
		J j = new J();
		System.out.println(j.y);

		j.pro();

		j.y = 12;

		j.pro();
	}
}
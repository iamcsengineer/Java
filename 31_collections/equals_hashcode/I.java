class I{
	public static void main(String[] args){
		I i = new I();

		System.out.println(i);
		System.out.println(i.toString());
		System.out.println(i.hashCode());
		System.out.println(Integer.toHexString(i.hashCode()));
	}
}
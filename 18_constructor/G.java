class G{
	static int count;

	G(){
		count++;
	}

	public static void main(String[] args){
		G g1 = new G();
		G g2 = new G();
		G g3 = new G();
		G g4 = new G();

		System.out.println(g1.count);
		System.out.println(g2.count);
		System.out.println(g3.count);
		System.out.println(g4.count);
	}
}
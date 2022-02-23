class G{
	{
		System.out.println("in inst init block");
	}

	static {
		System.out.println("in static init block");	
	}

	public static void main(String[] args){
		System.out.println("in main() start");
		G g = new G();
		System.out.println("in main() end");
	}
}
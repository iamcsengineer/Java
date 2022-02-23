enum CoffeeSize{
	SMALL(100),MEDIUM(200),LARGE(400);
	
	private int ml;

	CoffeeSize(int ml){
		this.ml = ml;
	}

	public int getMl(){
		return ml;
	}
}

class L{
	public static void main(String[] args){		
		System.out.println(CoffeeSize.LARGE.getMl());

		CoffeeSize[] arr = CoffeeSize.values();

		for(CoffeeSize cfz : arr){
			System.out.println(cfz+"~"+cfz.getMl());
		}
	}
}







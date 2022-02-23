enum CoffeeSize{
	SMALL(100,"A"),MEDIUM(200,"B"),LARGE(400,"C");
	
	private int ml;
	private String lid;

	CoffeeSize(int ml,String lid){
		this.ml = ml;
		this.lid = lid;
	}

	public int getMl(){
		return ml;
	}

	public String getLid(){
		return lid;
	}
}


class M{
	public static void main(String[] args){		
		//System.out.println(CoffeeSize.LARGE.getMl());

		CoffeeSize[] arr = CoffeeSize.values();

		for(CoffeeSize cfz : arr){
			System.out.println(cfz+"~"+cfz.getMl()+"~"+cfz.getLid());
		}
	}
}







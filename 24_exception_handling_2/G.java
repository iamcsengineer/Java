class G{
	public static void main(String[] args){
		System.out.println("~~~~ 1");
		
		if(args.length==0){
			System.out.println("~~~~ 2");
			NoCommandlineArgumentException y = new NoCommandlineArgumentException("Missing Commnadline argument...");
			
			try{
				throw y;
			}catch(NoCommandlineArgumentException e){
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}

		System.out.println("~~~~ 3");
	} 
}

class NoCommandlineArgumentException extends Exception{
	NoCommandlineArgumentException(){
	
	}

	NoCommandlineArgumentException(String msg){
		super(msg);
	}
}



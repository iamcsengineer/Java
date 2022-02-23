class V{
	public static void main(String[] args){
		System.out.println("~~~~~~ 1");

		try{
			try{
				System.out.println("~~~~~~ inside nested try");
			}catch(ArithmeticException e){
				e.printStackTrace();
			}finally{
				System.out.println("~~~~~~ Essential Code");
			}
		}catch(Exception e){
			try{
				System.out.println("~~~~~~ inside nested try");
			}catch(ArithmeticException f){
				f.printStackTrace();
			}finally{
				System.out.println("~~~~~~ Essential Code");
			}
		}finally{
			try{
				System.out.println("~~~~~~ inside nested try");
			}catch(ArithmeticException e){
				e.printStackTrace();
			}finally{
				System.out.println("~~~~~~ Essential Code");
			}
		}

		System.out.println("~~~~~~ 3");	
	}
}
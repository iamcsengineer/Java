class X{
	static int y = 58;
}

class K extends X{
	public static void main(String[] args){
		//System.out.println(y);

		if(2<3){
			//System.out.println(y+" ~~~");	

			for(int i=0;i<2;i++){
				System.out.println(y+" ^^^");
			}
		}
	}
}
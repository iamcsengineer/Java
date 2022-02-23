class X{
	X(){
		int a = 12/0;
	}
}


class G extends X{
	G(){
		
	}

	G(int y){
		this();
	}

	G(String s){
		this(12);
	}
	
	public static void main(String[] args){
		G g = new G("mohan");
	}
}
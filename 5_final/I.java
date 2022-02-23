class Y{

}

final class X extends Y{

}

class I{
	public static void main(String[] args){
		Y y = new X();

		X x = (X)y;
	}
}
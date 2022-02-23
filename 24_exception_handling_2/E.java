import java.io.*;

class X{
	X() throws IOException{
		FileWriter fw = new FileWriter("abc.txt");
	}
}

class E extends X{
	E() throws IOException{
		super();
	}

	public static void main(String[] args) throws IOException{
		E t = new E();
	}
}
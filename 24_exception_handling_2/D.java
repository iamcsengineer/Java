import java.io.*;

class D{
	public static void main(String[] args) throws IOException{
		abc();
	}

	static void abc() throws IOException{
		mno();
	}	

	static void mno() throws IOException{
		xyz();
	}

	static void xyz() throws IOException{
		FileWriter w = new FileWriter("mohan.txt");
	}
}
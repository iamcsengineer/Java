import java.io.*;

class F{
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("ganesh.txt");

		fw.write("mohan is in class 12th \n and he is a good boy");

		fw.close();
	}
}
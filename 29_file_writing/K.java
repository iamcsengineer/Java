import java.io.*;

class K{
	public static void main(String[] args) throws IOException{
		//Multiple Invocation required with different stirng arguments, to write method. 

		//Case 1: 
		//FileWriter fw = new FileWriter("abc.txt");
		
		//Case 2:
		FileWriter fw = new FileWriter("abc.txt",true);


		fw.write("ganesh");

		fw.close();
	}
}
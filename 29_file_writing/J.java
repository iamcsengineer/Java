import java.io.*;

class J{
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("abc.txt");	
		
		char[] arr = {'A','m','a','r'};
		fw.write(arr);

		fw.close();
	}
}
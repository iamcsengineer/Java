import java.io.*;

class D{
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("abc.txt");	

		int x = 0;
		while((x=fr.read())!=-1){
			System.out.print((char)x);
		}

		fr.close();
	}
}
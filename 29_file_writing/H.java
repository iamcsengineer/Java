import java.io.PrintWriter;
import java.io.FileNotFoundException;

class H{
	public static void main(String[] args){
		
		try{
			PrintWriter pw = new PrintWriter("xyz.txt");

			pw.println("We are learning file writing");
			pw.print("the methods does not throw any exception");

			pw.flush();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
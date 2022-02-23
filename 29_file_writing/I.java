import java.io.PrintWriter;
import java.io.FileNotFoundException;

class I{
	public static void main(String[] args){
		
		try{
			PrintWriter pw = new PrintWriter("xyz.txt");

			//pw.write(true);
			//pw.write(12.34);

			pw.println(true);
			pw.println(12.34);

			pw.flush();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
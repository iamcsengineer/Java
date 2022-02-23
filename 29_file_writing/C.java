import java.io.FileWriter;
import java.io.IOException;

class C{
	public static void main(String[] args){
		try{
			FileWriter fw = new FileWriter("mno.txt");

			fw.write('A');
			fw.write('m');
			fw.write('i');
			fw.write('t');	
			
			fw.flush();
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
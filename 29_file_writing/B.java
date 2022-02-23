import java.io.FileWriter;
import java.io.IOException;

class B{
	public static void main(String[] args){
		try{
			FileWriter fw = new FileWriter("mno.txt");

			fw.write('A');
			fw.write('m');
			fw.write('i');
			fw.write('t');			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
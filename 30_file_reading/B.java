import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class B{
	public static void main(String[] args){
		File file = new File("abc.txt");

		try{
			FileReader fr = new FileReader(file);

			int ch = fr.read();
			System.out.println((char)ch);

			ch = fr.read();
			System.out.println((char)ch);

			fr.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();		
		}
	}
}
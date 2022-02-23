import java.io.FileReader;
import java.io.FileNotFoundException;

class A{
	public static void main(String[] args){
		try{
			FileReader fr = new FileReader("abc.txt");	
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}	
	}
}
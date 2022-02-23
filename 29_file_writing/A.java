import java.io.FileWriter;
import java.io.IOException;

class A{
	public static void main(String[] args){
		try{
			FileWriter fw = new FileWriter("abc.txt");
		}catch(IOException e){
			e.printStackTrace();
		}		
	}
}
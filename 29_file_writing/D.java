import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class D{
	public static void main(String[] args){
		File file = new File("xyz.txt");

		try{
			FileWriter fw = new FileWriter(file);

			fw.write("Mohan is in class 10th");

			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
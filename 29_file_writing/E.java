import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

class E{
	public static void main(String[] args){
		File file = new File("mohan.txt");

		try{
			FileWriter fw = new FileWriter(file);

			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("MOhan is a good boy......!");

			bw.flush();
			bw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
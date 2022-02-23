import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class G{
	public static void main(String[] args){
		File file = new File("mno.txt");
		
		try{ 
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String str = null;
			while((str=br.readLine())!=null){
				System.out.println(str+"~");
			}

			br.close();
			fr.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
import java.io.File;
import java.io.IOException;

class E{
	public static void main(String[] args){
		File file = new File("abc.txt");

		System.out.println(file.exists());
		
		try{
			System.out.println(file.createNewFile());
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(file.exists());
	}
}
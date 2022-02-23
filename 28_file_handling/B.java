import java.io.File;

class B{
	public static void main(String[] args){		
		File file = new File("abc.txt");

		System.out.println(file.exists());
	}
}
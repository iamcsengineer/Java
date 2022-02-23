import java.io.File;

class C{
	public static void main(String[] args){
		//Case 1:
		//File file = new File("abc.txt");
		
		//Case 2:
		File file = new File("mno");

		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
	}
}
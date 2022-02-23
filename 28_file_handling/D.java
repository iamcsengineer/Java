import java.io.File;

class D{
	public static void main(String[] args){
		File file = new File("abc.txt");
		//System.out.println(file);

		//Case 2:
		File f2 = file.getAbsoluteFile();
		System.out.println("### "+f2);
		System.out.println("### "+file);
		//System.out.println(file==f2);

		//Case 1:
		//String absolutePath = file.getAbsolutePath();
		//System.out.println(">>> "+absolutePath);
	}
}
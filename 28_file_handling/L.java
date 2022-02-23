import java.io.File;

class L{
	public static void main(String[] args){
		//File file = new File("C:/Drives/javaprac/abc.txt");
		//File file = new File("C:/Drives","javaprac/pqr.txt");
		//File file = new File("C:/Drives/javaprac","abc.txt");

		File f1 = new File("C:/Drives/javaprac");
		File file = new File(f1,"old");

		System.out.println(file.exists());
	}
}
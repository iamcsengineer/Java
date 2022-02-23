import java.io.File;

class H{
	public static void main(String[] args){
		File file = new File("pqr.txt");

		File f1 = new File("mohan.txt");

		System.out.println(file.renameTo(f1));
	}
}
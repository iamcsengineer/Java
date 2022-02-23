import java.io.File;

class I{
	public static void main(String[] args){
		File file = new File("mohan.txt");

		File f1 = new File("abc/xyz/dinesh.txt");

		System.out.println(file.renameTo(f1));
	}
}
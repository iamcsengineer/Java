import java.io.File;

class K{
	public static void main(String[] args){
		File file = new File("abc/xyz/dinesh.txt");

		System.out.println(file.delete());
	}
}
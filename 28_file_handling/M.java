import java.io.File;

class M{
	public static void main(String[] args){
		File file = new File("abc");

		System.out.println(file.exists());
		System.out.println(file.delete());
		System.out.println(file.exists());
	}
}
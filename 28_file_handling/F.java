import java.io.File;

class F{
	public static void main(String[] args){
		File file = new File("mno");

		System.out.println(file.exists());

		System.out.println(file.mkdir());

		System.out.println(file.exists());
	}
}
import java.io.File;

class G{
	public static void main(String[] args){
		File file = new File("abc");

		System.out.println(file.delete());
	}
}
import java.io.File;

class G{
	public static void main(String[] args){
		File file = new File("abc/xyz");

		//System.out.println(file.mkdir());
		System.out.println(file.mkdirs());
	}
}
import java.io.File;

class J{
	public static void main(String[] args){
		File file = new File("abc");

		String[] arr = file.list();	

		for(String tmp : arr){
			System.out.println(tmp);
		}
	}
}
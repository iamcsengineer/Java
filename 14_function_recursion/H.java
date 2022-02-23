import java.io.File;

class H{
	public static void main(String[] args){
		File file = new File("abc");

		delete(file);
	}

	static void delete(File f){
		if(f.isDirectory()){
			String[] arr = f.list();
			for(String tmp : arr){
				File x = new File(f,tmp);
				delete(x);
			}
		}
		
		System.out.println(f);
		f.delete();
	}
}
import java.io.File;

class I{
	public static void main(String[] args){
		File file = new File("abc");
		
		delete(file);
	}	

	static void delete(File file){
		if(file.isDirectory()){
			String[] arr = file.list();

			for(String tmp : arr){
				File x = new File(file,tmp);

				delete(x);
			}
		}else{
			String str = file.toString();

			if(!str.endsWith(".C")){
				file.delete();
			}
		}
	}
}
import java.io.*;

class C{
	public static void main(String[] args){
		try{
			FileReader fr = new FileReader("abc.txt");
			
			int ch = fr.read();
			do{
				System.out.print((char)ch);
				ch = fr.read();
			}while(ch!=-1);

			fr.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
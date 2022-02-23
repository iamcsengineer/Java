import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class B{
	public static void main(String[] args){
		File file = new File("abc.txt");

		try{
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Shape shape = (Shape)ois.readObject();
			System.out.println(shape.l);
			System.out.println(shape.w);
			System.out.println(shape.h);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
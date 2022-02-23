import java.io.*;

class B{
	public static void main(String[] args){
		try{
			Employee x = (Employee)new ObjectInputStream(new FileInputStream("abc.txt")).readObject();
			System.out.println(x.address.city.cityName);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
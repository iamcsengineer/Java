import java.io.*;

class B{
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		Employee e = (Employee)new ObjectInputStream(new FileInputStream("abc.txt")).readObject();

		System.out.println(e.name);
		System.out.println(e.age);
	}
}
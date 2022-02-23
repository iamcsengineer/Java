import java.io.*;

class B{
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		Student s = (Student)new ObjectInputStream(new FileInputStream(new File("abc.txt"))).readObject();
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.degree);
		System.out.println(s.branch);
		System.out.println(s.semester);
	}
}
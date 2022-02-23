import java.io.*;

class A{
	public static void main(String[] args) throws IOException{
		Student student = new Student();
		student.name = "raghav";
		student.age = 20;
		student.degree = "BE";
		student.branch = "IT";
		student.semester = "7th";

		new ObjectOutputStream(new FileOutputStream(new File("abc.txt"))).writeObject(student);
	}
}
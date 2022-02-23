import java.io.*;

class A{
	public static void main(String[] args) throws IOException{
		Employee emp = new Employee();
		emp.name = "Mohan";
		emp.age = 35;
		
		new ObjectOutputStream(new FileOutputStream("abc.txt")).writeObject(emp);
	}
}
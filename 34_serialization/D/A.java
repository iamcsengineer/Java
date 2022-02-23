import java.io.*;

class A{
	public static void main(String[] args) throws IOException{
		Address addr = new Address();
		addr.city = "Jaipur";
		addr.state = "Rajasthan";

		Employee emp = new Employee();
		emp.name = "Mohan";
		emp.age = 35;
		emp.address = addr;

		new ObjectOutputStream(new FileOutputStream("abc.txt")).writeObject(emp);
	}
}
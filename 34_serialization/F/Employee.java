import java.io.Serializable;

class Employee implements Serializable{
	transient String name = "vasudev";
	int age;	
}
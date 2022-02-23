import java.io.Serializable;

class Employee implements Serializable{
	String name;
	int age;
	transient Address address;
}
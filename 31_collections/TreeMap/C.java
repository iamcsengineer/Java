import java.util.TreeMap;

class C{
	public static void main(String[] args){
		TreeMap map = new TreeMap();

		map.put(new Employee("mohan",45),34000);
		map.put(new Employee("vighnesh",34),25000);
		map.put(new Employee("ram",23),18000);

		System.out.println(map);
	} 
}

class Employee{
	String name;
	int age;

	Employee(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+":"+age;
	}
}
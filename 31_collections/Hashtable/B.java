import java.util.Hashtable;

class B{
	public static void main(String[] args){
		Hashtable map = new Hashtable();

		map.put(2345,new Employee("mohan",45));
		map.put(6789,new Employee("vighnesh",34));
		map.put(7890,new Employee("ram",23));
		
		//Employee e = new Employee("ram",23);
		//System.out.println(map.remove(e));
		//or
		System.out.println(map);
		System.out.println(map.remove(6789));
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
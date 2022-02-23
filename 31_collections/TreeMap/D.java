import java.util.TreeMap;

class D{
	public static void main(String[] args){
		TreeMap map = new TreeMap();

		map.put(new Employee("mohan",45),34000);
		map.put(new Employee("vighnesh",34),25000);
		map.put(new Employee("ram",23),18000);

		System.out.println(map);
	} 
}

class Employee implements Comparable<Employee>{
	String name;
	Integer age;

	Employee(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+":"+age;
	}

	public int compareTo(Employee e){
		return e.age.compareTo(this.age);
	}
	
	/*
	public int compareTo(Employee e){
		return this.age.compareTo(e.age);
	}*/
	
	/*
	public int compareTo(Employee e){
		return this.name.compareTo(e.name);
	}*/
}
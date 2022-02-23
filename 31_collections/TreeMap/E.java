import java.util.TreeMap;

import java.util.Comparator;

class E{
	public static void main(String[] args){
		TreeMap map = new TreeMap(new AgeSort());

		map.put(new Employee("mohan",45),34000);
		map.put(new Employee("vighnesh",34),25000);
		map.put(new Employee("ram",23),18000);

		System.out.println(map);
	} 
}

class NameSort implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){
		return e1.name.compareTo(e2.name);
	}
}

class AgeSort implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){
		return e1.age.compareTo(e2.age);
	}
}

class Employee{
	String name;
	Integer age;

	Employee(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+":"+age;
	}
}
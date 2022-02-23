import java.util.Collections;
import java.util.ArrayList;

class C{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		list.add(new Employee("raghu",23));
		list.add(new Employee("yati",45));
		list.add(new Employee("ghatotkatch",34));
		list.add(new Employee("kamlesh",28));
		list.add(new Employee("balveer",30));

		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
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
		return name+"#"+age;
	}	

	public int compareTo(Employee e){
		return this.age.compareTo(e.age);
	}
	
	/*
	public int compareTo(Employee e){
		return this.name.compareTo(e.name);
	}*/
}
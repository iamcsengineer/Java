import java.util.Collections;
import java.util.ArrayList;

class F{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		list.add(new Employee("raghu",23));
		list.add(new Employee("yati",45));
		list.add(new Employee("ghatotkatch",34));
		list.add(new Employee("kamlesh",28));
		list.add(new Employee("balveer",30));
		
		Collections.sort(list);
		//Employee x = new Employee("yati",45);
		Employee x = new Employee("yati",29);
		int index = Collections.binarySearch(list,x);
		System.out.println(index);
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
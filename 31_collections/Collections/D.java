import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

class D{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		list.add(new Employee("raghu",23));
		list.add(new Employee("yati",45));
		list.add(new Employee("ghatotkatch",34));
		list.add(new Employee("kamlesh",28));
		list.add(new Employee("balveer",30));

		System.out.println(list);

		NameSort ns = new NameSort();
		AgeSort as = new AgeSort();
		Collections.sort(list,as);
		
		System.out.println(list);
	}
}

class AgeSort implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2){
		return e1.age.compareTo(e2.age);
	}
}

class NameSort implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){
		return e1.name.compareTo(e2.name);
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
		return name+"#"+age;
	}	
}
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

class G{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		list.add(new Employee("raghu",23));
		list.add(new Employee("yati",45));
		list.add(new Employee("ghatotkatch",34));
		list.add(new Employee("kamlesh",28));
		list.add(new Employee("balveer",30));

		NameSort ns = new NameSort();
		NameRevSort nrs = new NameRevSort();
		AgeSort as = new AgeSort();
		AgeRevSort ars = new AgeRevSort();

		Employee x = new Employee("chetan",28);
		
		//Case 1:
		//Collections.sort(list,ars);		
		//int index = Collections.binarySearch(list,x,ars);

		//Case 2:
		Collections.sort(list,as);		
		int index = Collections.binarySearch(list,x,as);
		
		System.out.println(index);
	}
}

class AgeSort implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2){
		return e1.age.compareTo(e2.age);
	}
}

class AgeRevSort implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2){
		return e2.age.compareTo(e1.age);
	}
}

class NameSort implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){
		return e1.name.compareTo(e2.name);
	}
}

class NameRevSort implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){
		return e2.name.compareTo(e1.name);
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
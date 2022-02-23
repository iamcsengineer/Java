import java.util.PriorityQueue;
import java.util.Comparator;

class D{
	public static void main(String[] args){
		PriorityQueue<Employee> pq = new PriorityQueue<Employee>(new AgeRevSort());

		
		pq.offer(new Employee("rajan",34));
		pq.offer(new Employee("mayank",56));
		pq.offer(new Employee("vipul",42));
		pq.offer(new Employee("aman",30));
		pq.offer(new Employee("aman",26));

		
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
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

class AgeRevSort implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){
		return e2.age.compareTo(e1.age);
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
		return name+"-"+age;
	}
}
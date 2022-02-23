import java.util.PriorityQueue;
import java.util.Comparator;

class C{
	public static void main(String[] args){
		PriorityQueue pq = new PriorityQueue(new NameSort());

		
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

class NameSort implements Comparator{
	public int compare(Object o1,Object o2){
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;

		String nm1 = e1.name;
		String nm2 = e2.name;

		return nm1.compareTo(nm2);
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
		return name+"-"+age;
	}
}
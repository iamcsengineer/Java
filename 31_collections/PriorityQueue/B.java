import java.util.PriorityQueue;

class B{
	public static void main(String[] args){
		PriorityQueue pq = new PriorityQueue();

		
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

class Employee implements Comparable<Employee>{
	String name;
	int age;

	Employee(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"-"+age;
	}

	public int compareTo(Employee o){
		return this.name.compareTo(o.name);
	}
}
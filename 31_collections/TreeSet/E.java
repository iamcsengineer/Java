import java.util.TreeSet;

class E{
	public static void main(String[] args){
		TreeSet t = new TreeSet();

		t.add(new Student("mohan",12));
		t.add(new Student("rohan",7));
		t.add(new Student("eohan",20));
		t.add(new Student("sohan",9));
		t.add(new Student("gohan",13));
		t.add(new Student("mohan",15));

		System.out.println(t);
	}
}

class Student implements Comparable{
	String name;
	Integer age;

	Student(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"~"+age;
	}
		

	public int compareTo(Object o){
		Student s1 = this;
		Student s2 = (Student)o;

		String nm1 = s1.name;
		String nm2 = s2.name;

		return nm1.compareTo(nm2);
	}
	
	/*
	public int compareTo(Object o){
		Student s1 = this;
		Student s2 = (Student)o;

		Integer ag1 = s1.age;
		Integer ag2 = s2.age;

		return ag1.compareTo(ag2);
	}*/
}

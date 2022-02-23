import java.util.TreeSet;

import java.util.Comparator;

class F{
	public static void main(String[] args){
		NameSort ns = new NameSort();
		NameRevSort nrs = new NameRevSort();
		AgeSort as = new AgeSort();
		AgeRevSort ars = new AgeRevSort();

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

class NameSort implements Comparator{
	public int compare(Object o1, Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;

		String nm1 = s1.name;
		String nm2 = s2.name;

		return nm1.compareTo(nm2);
	}
}

class NameRevSort implements Comparator{
	public int compare(Object o1, Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;

		String nm1 = s1.name;
		String nm2 = s2.name;

		return nm2.compareTo(nm1);
	}
}

class AgeSort implements Comparator{
	public int compare(Object o1,Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;

		Integer ag1 = s1.age;
		Integer ag2 = s2.age;

		return ag1.compareTo(ag2);
	}
}

class AgeRevSort implements Comparator{
	public int compare(Object o1,Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;

		Integer ag1 = s1.age;
		Integer ag2 = s2.age;

		return ag2.compareTo(ag1);
	}
}


class Student{
	String name;
	Integer age;

	Student(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"~"+age;
	}	
}

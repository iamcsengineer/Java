import java.util.TreeSet;

import java.util.Comparator;

import java.io.Console;

class G{
	public static void main(String[] args){
		System.out.println("Enter 1 for NS, 2 for NRS, 3 for AS and 4 for ARS: ");
		Console con = System.console();

		String inp = con.readLine();

		int val = Integer.parseInt(inp);

		Comparator comp = null;

		if(val==1){
			comp = new NameSort();
		}else if(val==2){
			comp = new NameRevSort();
		}else if(val==3){
			comp = new AgeSort();
		}else{
			comp = new AgeRevSort();
		}


		TreeSet t = new TreeSet(comp);

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

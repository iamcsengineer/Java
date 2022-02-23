import java.util.HashSet;

class C{
	public static void main(String[] args){
		HashSet s = new HashSet();

		s.add(new Student("jayant",12));
		s.add(new Student("vinayak",7));
		s.add(new Student("vidyut",17));
		s.add(new Student("prakash",5));
		s.add(new Student("vikas",11));
		s.add(new Student("vidyut",17));

		System.out.println(s);
		//Student x = new Student("prakash",5);
		//System.out.println(s.contains(x));
		//System.out.println(s.remove(x));
	}
}

class Student{
	String name;
	int age;

	Student(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"~"+age;
	}

	public boolean equals(Object o){
		Student s1 = this;
		Student s2 = (Student)o;

		String nm1 = s1.name;
		String nm2 = s2.name;

		return nm1.equals(nm2);
	}
}
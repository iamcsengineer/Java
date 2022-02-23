import java.util.ArrayList;

class T{
	public static void main(String[] x){
		ArrayList a = new ArrayList();
		
		a.add(new Student("mohan",12));
		a.add(new Student("rohan",9));
		a.add(new Student("dohan",14));
		a.add(new Student("tohan",18));
		a.add(new Student("gohan",5));

		Student s = new Student("tohan",18);
		//System.out.println(a.contains(s));
		
		System.out.println(a);
		System.out.println(a.remove(s));
		System.out.println(a);
	}
}


class Student{
	String name;
	int age;

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+" ~ "+age;
	}
	
	public boolean equals(Object obj){
		Student a = this;
		Student b = (Student)obj;

		String nm1 = a.name;
		String nm2 = b.name;
		System.out.println(nm1+" # "+nm2);

		int ag1 = a.age;
		int ag2 = b.age;

		return nm1.equals(nm2)&&ag1==ag2;
	}
}
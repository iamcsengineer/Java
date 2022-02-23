import java.util.HashSet;

class E{
	public static void main(String[] args){
		Student s1 = new Student("mohan",12);	
		Student s2 = new Student("sohan",15);	
		Student s3 = new Student("rohan",18);
		Student s4 = new Student("gohan",7);
		Student s5 = new Student("mohan",11);
		
		HashSet s = new HashSet();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);

		System.out.println(s);
		Student x = new Student("rohan",18);
		System.out.println(s.contains(x));
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
		boolean flag = false;

		if(o instanceof Student){
			Student s1 = this;
			Student s2 = (Student)o;

			String nm1 = s1.name;
			String nm2 = s2.name;

			if(nm1.equals(nm2)){
				flag = true;
			}
		}

		return flag;
	}

	public int hashCode(){
		return 12;
	}
}



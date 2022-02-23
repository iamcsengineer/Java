class B{
	public static void main(String[] args){
		Student s1 = new Student("mohan",12);	
		Student s2 = new Student("mohan",12);	
		
		//Case 2:
		B b = new B();
		System.out.println(s1.equals(b));

		//Case 1:
		//System.out.println(s1.equals(s2));
		//System.out.println(s1==s2);
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



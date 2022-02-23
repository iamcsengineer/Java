class Student{
	String name;
	int age;
	String college;
	String degree;
	String semester;

	Student(String name,int age,String college,String degree,String semester){
		this.name = name;
		this.age = age;
		this.college = college;
		this.degree = degree;
		this.semester = semester;
	}
}

class F{
	public static void main(String[] args){
		Student s = new Student("Ganesh",12,"GLOBAL","MTech","4th");

		System.out.println("Name: "+s.name);	
		System.out.println("Age: "+s.age);	
		System.out.println("College: "+s.college);	
		System.out.println("Degree: "+s.degree);	
		System.out.println("Semester: "+s.semester);	
	}
}
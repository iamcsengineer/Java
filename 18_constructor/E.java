class Student{
	String name;
	int age;
	String college;
	String degree;
	String semester;
}

class E{
	public static void main(String[] args){
		Student s = new Student();

		System.out.println("Name: "+s.name);	
		System.out.println("Age: "+s.age);	
		System.out.println("College: "+s.college);	
		System.out.println("Degree: "+s.degree);	
		System.out.println("Semester: "+s.semester);	

		s.name = "mohan";
		s.age = 21;
		s.college = "GGITS";
		s.degree = "BTech";
		s.semester = "3rd";
		System.out.println("\n\n###########################\n\n");
		
		System.out.println("Name: "+s.name);	
		System.out.println("Age: "+s.age);	
		System.out.println("College: "+s.college);	
		System.out.println("Degree: "+s.degree);	
		System.out.println("Semester: "+s.semester);	
	}
}
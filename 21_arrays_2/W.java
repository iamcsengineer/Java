class W{
	public static void main(String[] args){
		Student[][] x = {
							{new Student("mohan",12),new Student("rohan",23),new Student("sohan",9)},
							{new Student("seeta",10),new Student("geeta",7)},
							{new Student("mahesh",5),new Student("suresh",12),new Student("ganesh",25),new Student("mangesh",19)}
						};

		for(Student[] y : x){
			for(Student s : y){
				System.out.println(s+" ~~");
			}
			System.out.println();		
		}
	}
}


class Student{
	String name;
	int age;

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
}









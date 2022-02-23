class D{
	public static void main(String[] args){
		Student s1 = new Student("mohan",12);	
		Student s2 = new Student("mohan",15);	
		Student s3 = new Student("mohan",18);
		
		//reflexive
		//System.out.println(s1.equals(s1));
		//System.out.println(s2.equals(s2));
		//System.out.println(s3.equals(s3));
		
		//symmetric
		//System.out.println(s1.equals(s2));
		//System.out.println(s2.equals(s1));

		//transitive
		//System.out.println(s1.equals(s2));
		//System.out.println(s2.equals(s3));
		//System.out.println(s1.equals(s3));

		//consistent
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.equals(s2));

		//null test
		System.out.println(s1.equals(null));
		System.out.println(s2.equals(null));
		System.out.println(s3.equals(null));
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
}



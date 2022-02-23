class G{
	public static void main(String[] args){
		Student a = new Student("mohan",12);
		Student b = new Student("mohan",12);

		System.out.println(a==b);
		//System.out.println(a+" #########");
		System.out.println(a.equals(b));
	}
}

class Student{
	String name;
	int age;
	
	public boolean equals(Object o){
		Student x = this;
		Student y = (Student)o;
		
		String nm1 = x.name;
		String nm2 = y.name;

		int ag1 = x.age;
		int ag2 = y.age;
		
		return nm1.equals(nm2)&&ag1==ag2;
	}

	Student(String name, int age){
		this.name = name;
		this.age = age; 
	}
}
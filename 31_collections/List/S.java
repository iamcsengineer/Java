import java.util.ArrayList;

class S{
	public static void main(String[] args){
		ArrayList a = new ArrayList();
		
		a.add(new Student("mohan",12));
		a.add(new Student("rohan",9));
		a.add(new Student("dohan",14));
		a.add(new Student("tohan",18));
		a.add(new Student("gohan",5));

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
}
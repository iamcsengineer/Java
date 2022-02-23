import java.util.TreeSet;

class C{
	public static void main(String[] args){
		TreeSet t = new TreeSet();

		t.add(new Student("mohan",12));
		t.add(new Student("rohan",7));
		t.add(new Student("eohan",20));
		t.add(new Student("sohan",9));
		t.add(new Student("gohan",13));
		t.add(new Student("mohan",15));

		System.out.println(t);
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
		return name+"~"+age;
	}

	public boolean equals(Object obj){
		boolean flag = false;

		if(obj instanceof Student){
			Student s1 = this;
			Student s2 = (Student)obj;

			String nm1 = s1.name;
			String nm2 = s2.name;

			if(nm1.equals(nm2)){
				flag = true;
			}
		}

		return flag;
	}
}

import java.util.Arrays;

class D{
	public static void main(String[] args){
		Student[] arr = {new Student("ram",23),
						 new Student("aman",12),
						 new Student("vikram",21),
						 new Student("kamlesh",18)};

		Arrays.sort(arr);
		for(Student s : arr){
			System.out.println(s);
		}
	}
}

class Student{
	String name;
	Integer age;

	Student(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+":"+age;
	} 
}
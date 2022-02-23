import java.util.Arrays;

class E{
	public static void main(String[] args){
		Student[] arr = {new Student("ram",23),
						 new Student("aman",12),
						 new Student("vikram",21),
						 new Student("kamlesh",18)};

		
		for(Student s : arr){
			System.out.println(s);
		}
		System.out.println("#####################");

		Arrays.sort(arr);
		
		for(Student s : arr){
			System.out.println(s);
		}
	}
}

class Student implements Comparable<Student>{
	String name;
	Integer age;

	Student(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+":"+age;
	} 

	public int compareTo(Student s){
		return this.name.compareTo(s.name);
	}
}
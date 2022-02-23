import java.util.Arrays;
import java.util.Comparator;

class F{
	public static void main(String[] args){
		Student[] arr = {new Student("ram",23),
						 new Student("aman",12),
						 new Student("vikram",21),
						 new Student("kamlesh",18)};

		
		for(Student s : arr){
			System.out.println(s);
		}
		System.out.println("#####################");
		
		AgeSort as = new AgeSort();
		Arrays.sort(arr,as);
		
		for(Student s : arr){
			System.out.println(s);
		}
	}
}

class AgeSort implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return s1.age.compareTo(s2.age);
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
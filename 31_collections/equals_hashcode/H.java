import java.util.HashSet;

class H{
	public static void main(String[] args){
		Student s1 = new Student("mohan",12);	
		Student s2 = new Student("sohan",15);	
		Student s3 = new Student("mohan",18);
		Student s4 = new Student("hanmo",19);

		//Case 3a:
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.hashCode());
		//System.out.println(s2.hashCode());

		//Case 3b:
		//System.out.println(s1.equals(s4));
		//System.out.println(s1.hashCode());
		//System.out.println(s4.hashCode());
		
		//Case 2:
		//System.out.println(s1.equals(s3));
		//System.out.println(s1.hashCode());
		//System.out.println(s3.hashCode());

		//Case 1:
		/*
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
		*/
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

			int ag1 = s1.age;
			int ag2 = s2.age;

			if(nm1.equals(nm2)&&ag1==ag2){
				flag = true;
			}
		}

		return flag;
	}

	public int hashCode(){
		int hc = 0;

		String abc = " abcdefghijklmnopqrstuvwxyz";

		for(int i=0;i<name.length();i++){
			hc = hc + abc.indexOf(name.charAt(i));
		}

		hc = hc + age;

		return hc;
	}
}



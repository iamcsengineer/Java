import java.util.HashSet;

class D{
	public static void main(String[] args){
		HashSet s = new HashSet();

		s.add(new Student("jayant",12));
		s.add(new Student("vinayak",7));
		s.add(new Student("vidyut",17));
		s.add(new Student("prakash",5));
		s.add(new Student("vikas",11));
		s.add(new Student("vidyut",17));

		System.out.println(s);
		Student x = new Student("prakash",5);
		//System.out.println(s.contains(x));
		System.out.println(s.remove(x));
		System.out.println(s);
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

class Student{
	String name;
	int age;

	static int maxAge = 20;

	public static void main(String[] args){
		Student s = new Student();
		s.name = "mohan";
		s.age = 12;

		Student r = new Student();
		r.name = "ganesh";
		r.age = 14;

		//System.out.println(name);
		System.out.println(s.name);
		System.out.println(r.age);
	}
}
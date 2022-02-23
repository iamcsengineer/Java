class User{
	User(String userName,String email,String gender,String contact,String address){
		this.userName = userName;
		this.email = email;
		this.gender = gender;
		this.contact = contact;
		this.address = address;
	}
	
	String userName;
	String email;
	String gender;
	String contact;
	String address;
}

class Student extends User{	
	Student(String userName,String email,String gender,String contact,String address,String college,String degree,String semester,String bracnch){
		super(userName,email,gender,contact,address);
		/*
		this.userName = userName;
		this.email = email;
		this.gender = gender;
		this.contact = contact;
		this.address = address;*/
		this.college = college;
		this.degree = degree;
		this.semester = semester;
		this.branch = branch;
	}
	String college;
	String degree;
	String semester;
	String branch;
}

class Teacher extends User{	
	Teacher(String userName,String email,String gender,String contact,String address,String designation,String highestQualification,int salary,int experience){
		super(userName,email,gender,contact,address);
		/*
		this.userName = userName;
		this.email = email;
		this.gender = gender;
		this.contact = contact;
		this.address = address;*/
		this.designation = designation;
		this.highestQualification = highestQualification;
		this.salary = salary;
		this.experience = experience;
	}

	String designation;
	String highestQualification;
	int salary;
	int experience;
}

class X{
	public static void main(String[] args){
		Teacher t = new Teacher("Jitesh Kumar","jitu@gmail.com","male","7777777777","Jbp","Junior Faculty","MTech",45000,34);
			
		System.out.println(t.userName);
		System.out.println(t.email);
		System.out.println(t.gender);
		System.out.println(t.contact);
		System.out.println(t.address);
		System.out.println(t.designation);
		System.out.println(t.highestQualification);
		System.out.println(t.salary);
		System.out.println(t.experience);
		
	}
}
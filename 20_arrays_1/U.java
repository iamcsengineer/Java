class U{
	public static void main(String[] args){		
		Student[] x = {
						new Student("vishweshwar",28,new Address(new City("chennai"),new State("Tamilnadu"))),
						new Student("Subodh",32,new Address(new City("kolkata"),new State("WestBengal")))												
					   };

		for(Student s : x){
			System.out.println(s.name);
			System.out.println(s.age);
			System.out.println(s.address.city.cityName);
			System.out.println(s.address.state.stateName);
			System.out.println("~~~~~~~~~~~~~~~~~");
		}	
	}
}

class Student{
	String name;
	int age;
	Address address;

	Student(String name,int age,Address address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
}

class Address{
	City city;
	State state;

	Address(City city,State state){
		this.city =city;
		this.state = state;
	}
}

class City{
	String cityName;

	City(String cityName){
		this.cityName = cityName;
	}
}

class State{
	String stateName;

	State(String stateName){
		this.stateName = stateName;
	}
}
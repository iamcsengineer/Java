class N{
	public static void main(String[] args){
		City c1 = new City("Indore");
		//c1.cityName = "Jabalpur";

		State s1 = new State("MP");
		//s1.stateName = "MP";

		Address addr1 = new Address(c1,s1);
		//addr1.city = c1;
		//addr1.state = s1;

		Student st1 = new Student("Ritesh",23,addr1);
		//st1.name = "mohan";
		//st1.age = 12;
		//st1.address = addr1;

		City c2 = new City("Pune");
		//c2.cityName = "Jaipur";
		
		State s2 = new State("Maharashtra");
		//s2.stateName = "Rajasthan";

		Address addr2 = new Address(c2,s2);
		//addr2.city = c2;
		//addr2.state = s2;

		Student st2 = new Student("Mukesh",19,addr2);
		//st2.name = "ganesh";
		//st2.age = 14;
		//st2.address = addr2;

		Student[] x = new Student[2];
		x[0] = st1;
		x[1] = st2;

		System.out.println(x[0].address.city.cityName);
		System.out.println(x[1].name);
		//System.out.println(x[1].stateName);

		//System.out.println(x[1].address.state.stateName instanceof String);
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
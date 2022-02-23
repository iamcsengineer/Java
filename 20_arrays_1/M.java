class M{
	public static void main(String[] args){
		City c1 = new City();
		c1.cityName = "Jabalpur";

		State s1 = new State();
		s1.stateName = "MP";

		Address addr1 = new Address();
		addr1.city = c1;
		addr1.state = s1;

		Student st1 = new Student();
		st1.name = "mohan";
		st1.age = 12;
		st1.address = addr1;

		City c2 = new City();
		c2.cityName = "Jaipur";
		
		State s2 = new State();
		s2.stateName = "Rajasthan";

		Address addr2 = new Address();
		addr2.city = c2;
		addr2.state = s2;

		Student st2 = new Student();
		st2.name = "ganesh";
		st2.age = 14;
		st2.address = addr2;

		Student[] x = new Student[2];
		x[0] = st1;
		x[1] = st2;

		//System.out.println(x[1].address.state.stateName);
		//System.out.println(x[1].stateName);

		System.out.println(x[1].address.state.stateName instanceof String);
	}
}


class Student{
	String name;
	int age;
	Address address;
}

class Address{
	City city;
	State state;
}

class City{
	String cityName;
}

class State{
	String stateName;
}
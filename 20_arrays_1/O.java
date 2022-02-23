//Case 2:
/*
class O{
	public static void main(String[] args){		
		Student st1 = new Student("Ritesh",23,new Address(new City("Ahmdabad"),new State("Gujrat")));
	
		//---------------------------------

		Student st2 = new Student("Mukesh",19,new Address(new City("Lakhnaow"),new State("UP")));
		
		//-----------------------

		Student[] x = new Student[2];
		x[0] = st1;
		x[1] = st2;

		System.out.println(x[1].address.state.stateName);
		//System.out.println(x[1].name);
		//System.out.println(x[1].stateName);

		//System.out.println(x[1].address.state.stateName instanceof String);
	}
}
*/



//Case 1:
/*
class O{
	public static void main(String[] args){
		City c1 = new City("Indore");

		State s1 = new State("MP");

		Address addr1 = new Address(c1,s1);

		Student st1 = new Student("Ritesh",23,addr1);
	
		//---------------------------------

		City c2 = new City("Pune");
		
		State s2 = new State("Maharashtra");

		Address addr2 = new Address(c2,s2);

		Student st2 = new Student("Mukesh",19,addr2);
		
		//-----------------------

		Student[] x = new Student[2];
		x[0] = st1;
		x[1] = st2;

		System.out.println(x[0].address.city.cityName);
		System.out.println(x[1].name);
		//System.out.println(x[1].stateName);

		//System.out.println(x[1].address.state.stateName instanceof String);
	}
}
*/


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
import java.io.*;

class A{
	public static void main(String[] args){
		City city = new City();
		city.cityName = "Jabalpur";

		State state = new State();
		state.stateName = "MP";

		Address addr = new Address();
		addr.city = city;
		addr.state = state;
		
		Employee e = new Employee();
		e.name = "ram";
		e.age = 34;
		e.address = addr;

		try{
			new ObjectOutputStream(new FileOutputStream("abc.txt")).writeObject(e);
		}catch(FileNotFoundException t){
			t.printStackTrace();
		}catch(IOException f){
			f.printStackTrace();
		} 
	} 
}
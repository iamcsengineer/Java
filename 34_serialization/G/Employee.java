import java.io.*;

class Employee implements Serializable{
	String name;
	int age;
	transient Address address;

	private void writeObject(ObjectOutputStream oos){
		try{
			oos.defaultWriteObject();
			oos.writeObject(address.city.cityName);
			oos.writeObject(address.state.stateName);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream ois){
		try{
			ois.defaultReadObject();
			address = new Address();
			address.city = new City();
			address.city.cityName = (String)ois.readObject();
			address.state = new State();
			address.state.stateName = (String)ois.readObject();
		}catch(IOException|ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
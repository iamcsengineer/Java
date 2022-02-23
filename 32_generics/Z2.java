import java.util.ArrayList;

class Car{ }
class Bus{ }

class Rent<T>{
	ArrayList<T> records = new ArrayList<T>();

	void addRecord(T t){
		records.add(t);
	}

	T getRecord(){
		return records.get(0);
	}
}

class Z2{
	public static void main(String[] args){
		Rent<Car> rc = new Rent<Car>();
		rc.addRecord(new Car());
		Car car = rc.getRecord();

		Rent<Bus> rb = new Rent<Bus>();
		rb.addRecord(new Bus());
		Bus bus = rb.getRecord();
	}
}
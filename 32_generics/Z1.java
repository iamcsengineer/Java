import java.util.ArrayList;

class Car{ }
class Bus{ }

class RentCar{
	ArrayList<Car> cars = new ArrayList<Car>();

	void addCar(Car car){
		cars.add(car);
	}

	Car getCar(){
		return cars.get(0);
	}
}

class RentBus{
	ArrayList<Bus> buses = new ArrayList<Bus>();

	void addBus(Bus bus){
		buses.add(bus);
	}

	Bus getBus(){
		return buses.get(0);
	}
}

class Z1{
	public static void main(String[] args){
		RentCar rc = new RentCar();
		rc.addCar(new Car());
		Car car = rc.getCar();

		RentBus rb = new RentBus();
		rb.addBus(new Bus());
		Bus bus = rb.getBus();
	}
}
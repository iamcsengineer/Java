import java.util.*;

class Car{ }

class Z{
	public static void main(String[] args){
		//Case 4:
		ArrayList<Object> l1 = new ArrayList<Integer>();
		ArrayList<Object> l2 = new ArrayList<Double>();
		ArrayList<Object> l3 = new ArrayList<Number>();
		ArrayList<Object> l4 = new ArrayList<Object>();
		ArrayList<Object> l5 = new ArrayList<Car>();
		
		//Case 3:
		/*
		ArrayList l1 = new ArrayList<Integer>();
		ArrayList l2 = new ArrayList<Double>();
		ArrayList l3 = new ArrayList<Number>();
		ArrayList l4 = new ArrayList<Object>();
		ArrayList l5 = new ArrayList<Car>();
		*/

		//Case 2:
		/*
		ArrayList<? extends Object> l1 = new ArrayList<Integer>();
		ArrayList<? extends Object> l2 = new ArrayList<Double>();
		ArrayList<? extends Object> l3 = new ArrayList<Number>();
		ArrayList<? extends Object> l4 = new ArrayList<Object>();
		ArrayList<? extends Object> l5 = new ArrayList<Car>();
		*/

		//Case 1:
		/*
		ArrayList<?> l1 = new ArrayList<Integer>();
		ArrayList<?> l2 = new ArrayList<Double>();
		ArrayList<?> l3 = new ArrayList<Number>();
		ArrayList<?> l4 = new ArrayList<Object>();
		ArrayList<?> l5 = new ArrayList<Car>();
		*/
	}
}
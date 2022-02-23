import java.util.*;

class S{
	public static void main(String[] args){
		ArrayList<? extends Number> list1 = new ArrayList<Integer>(); 
		ArrayList<? extends Number> list2 = new ArrayList<Long>(); 
		ArrayList<? extends Number> list3 = new ArrayList<Short>(); 
		ArrayList<? extends Number> list4 = new ArrayList<Byte>(); 
		ArrayList<? extends Number> list5 = new ArrayList<Float>(); 
		ArrayList<? extends Number> list6 = new ArrayList<Double>(); 
		ArrayList<? extends Number> list7 = new ArrayList<Number>(); 
	}
}
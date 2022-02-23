import java.util.Arrays;
import java.util.List;

class J{
	public static void main(String[] args){
		int[] x = {12,45,67,89};

		List list = Arrays.asList(x);

		//System.out.println(list);
		
		/*		
		for(Object i : list){
			System.out.println(i);
		}*/
		
		/*
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		
		/*
		for(int i=0;i<x.length;i++){
			System.out.println(list.get(i));
		}*/

		list.set(1,33);
	}
}
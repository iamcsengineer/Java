import java.util.Arrays;

class G{
	public static void main(String[] args){
		int[] a = {45,78,23,34,9};

		
		Arrays.sort(a);
		//int index = Arrays.binarySearch(a,30);
		int index = Arrays.binarySearch(a,23);
		System.out.println(index);
	} 
}
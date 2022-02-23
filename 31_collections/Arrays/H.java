import java.util.Arrays;

class H{
	public static void main(String[] args){
		char[] a = {'m','o','h','a','n'};

		
		Arrays.sort(a);
		//int index = Arrays.binarySearch(a,'j');
		int index = Arrays.binarySearch(a,'m');
		System.out.println(index);		
	} 
}
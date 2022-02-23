import java.util.Arrays;

class A{
	public static void main(String[] args){
		int[] a = {45,78,23,34,9};

		for(int tmp : a){
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		Arrays.sort(a);

		for(int tmp : a){
			System.out.print(tmp+" ");
		}
	} 
}
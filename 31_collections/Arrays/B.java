import java.util.Arrays;

class B{
	public static void main(String[] args){
		char[] a = {'m','o','h','a','n'};

		for(char tmp : a){
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		Arrays.sort(a);

		for(char tmp : a){
			System.out.print(tmp+" ");
		}
	} 
}
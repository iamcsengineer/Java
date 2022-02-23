import java.util.Arrays;

class C{
	public static void main(String[] args){
		String[] a = {"mohan","raghu","karthik","vigyan","sarvesh"};

		for(String tmp : a){
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		Arrays.sort(a);

		for(String tmp : a){
			System.out.print(tmp+" ");
		}
	} 
}
import java.util.Arrays;

class I{
	public static void main(String[] args){
		String[] a = {"mohan","raghu","karthik","vigyan","sarvesh"};
		
		
		Arrays.sort(a);
		int index = Arrays.binarySearch(a,"rakesh");
		System.out.println(index);
	} 
}
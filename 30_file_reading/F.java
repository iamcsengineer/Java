import java.io.*;

import java.util.Arrays;

class F{
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("mno.txt");
		
		char[] arr = new char[10];
		int x = 0;
		while((x=fr.read(arr))!=-1){
			for(char ch : arr){
				System.out.print(ch);
			}

			Arrays.fill(arr,'\0');
		}
	}
}
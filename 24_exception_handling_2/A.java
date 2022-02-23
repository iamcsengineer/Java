import java.io.*;

//Case 2:
/*
class A{
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("mohan.txt"); 
	}
}*/

//Case 1:
/*
class A{
	public static void main(String[] args){
		try{
			FileWriter fw = new FileWriter("mohan.txt"); 
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}*/
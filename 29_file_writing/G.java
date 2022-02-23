import java.io.*;

class G{
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("ganesh.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("mohan is in class 12th");
		
		bw.newLine();
		
		bw.write("and he is a good boy");

		bw.close();
	}
}
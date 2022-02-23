import java.io.*;

class H /*extends Exception*/{
	public static void main(String[] args){
		try{
			//throw new Throwable();
			//throw new Exception();
			//throw new Error();
			//throw new IOException();
			//throw new ArithmeticException();
			//throw new H();
		}catch(Throwable e){
			System.out.println("#####");
			e.printStackTrace();
			System.out.println("#####");
		}
	}
}
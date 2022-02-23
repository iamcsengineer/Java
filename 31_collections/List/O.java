import java.util.ArrayList;

class O{
	public static void main(String[] args){
		ArrayList a = new ArrayList();

		a.add("mohan");
		a.add("rohan");
		a.add("sohan");
		a.add("gohan");
		a.add("tohan");

		System.out.println(a);

		for(int i=0;i<a.size();i++){
			//System.out.println(a.get(i));
			System.out.println(a.remove(i));
		}
		
		System.out.println(a);
	}
}
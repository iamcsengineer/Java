class Shape{
	int l;
	int w;
	int h;

	Shape(int l){
		this.l = l;
	}

	Shape(int l,int w){
		this.l = l;
		this.w = w;
	}

	Shape(int l,int w,int h){
		this.l = l;
		this.w = w;
		this.h = h;
	}
}

class I{
	public static void main(String[] args){
		//Case 1:
		//Shape s1 = new Shape(12);
		
		//Case 2:
		Shape s1 = new Shape(12,13);
		
		//Case 3:
		//Shape s1 = new Shape(12,13,14);

		System.out.println("l: "+s1.l);
		System.out.println("w: "+s1.w);
		System.out.println("h: "+s1.h);
	}
}
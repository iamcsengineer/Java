class Shape{
	int l;
	int w;
	int h;

	Shape(int l){
		this.l = l;
	}

	Shape(int l,int w){
		System.out.println("~~~~~");
		this.l = l;
		this.w = w;
	}

	Shape(int l,int w,int h){
		this(l,w);
		System.out.println("#####");
		//this.l = l;
		//this.w = w;
		this.h = h;
	}

	public static void main(String[] args){
		Shape s = new Shape(12,13,14);
	}
}
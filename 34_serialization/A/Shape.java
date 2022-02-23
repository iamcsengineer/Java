import java.io.Serializable;

class Shape implements Serializable{
	int l;
	int w;
	int h;

	Shape(int l,int w,int h){
		this.l = l;
		this.w = w;
		this.h = h;
	}
}
//Case 2:
/*
class A{
	int abc(){
		return 12;
	}
}

class B extends A{
	byte abc(){
		byte a = 23;
		return a;
	}
}*/


//Case 1:
/*
class A{
	int abc(){
		return 12;
	}
}

class B extends A{
	//legal overriding => if return type is primitive then same return type should be specified in overriding method
	
	int abc(){
		return 23;
	}
}
*/
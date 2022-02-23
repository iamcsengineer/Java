class W{
	int y = 90;
}

class S extends W{
	static{
		System.out.println(this);
		System.out.println(super.y);
	}
}
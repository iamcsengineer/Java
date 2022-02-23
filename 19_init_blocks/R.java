class W{
	int y = 90;
}

class R extends W{
	{
		System.out.println(this);
		System.out.println(super.y);
	}
}
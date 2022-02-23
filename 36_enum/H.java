enum Days{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY //;
}

class H{
	static Days day = Days.MONDAY;

	public static void main(String[] args){		
		System.out.println(day instanceof Object);	
	}
}
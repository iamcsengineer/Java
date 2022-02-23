enum Days{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY //;
}

class F{
	public static void main(String[] args){
		System.out.println(Days.values());
		
		Days[] days = Days.values();
		for(Days day : days){
			System.out.println(day);
		}
	}
}
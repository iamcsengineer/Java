import java.util.HashMap;

class O{
	public static void main(String[] args){
		HashMap map = new HashMap();

		map.put(new Employee("mohan",45),34000);
		map.put(new Employee("vighnesh",34),25000);
		map.put(new Employee("ram",23),18000);

		System.out.println(map);
		Employee x = new Employee("ram",23);
		//System.out.println(map.containsKey(x));
		System.out.println(map.remove(x));
		System.out.println(map);
	}
}

class Employee{
	String name;
	int age;

	Employee(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+":"+age;
	}

	public boolean equals(Object o){
		boolean flag = false;

		if(o instanceof Employee){
			Employee e1 = this;
			Employee e2 = (Employee)o;

			String nm1 = e1.name;
			String nm2 = e2.name;

			if(nm1.equals(nm2)){
				flag = true;
			}
		}	

		return flag;
	}

	public int hashCode(){
		int sum = 0;

		String abc = " abcdefghijklmnopqrstuvwxyz";

		for(int i=0;i<name.length();i++){
			sum = sum + abc.indexOf(name.charAt(i));
		}

		return sum;
	}
}
interface Radio{
	void powerController();
	void soundController();
	void bandSelector();
	void channelSelector();
}

class LGRadio implements Radio{
	public void powerController(){
		System.out.println("LGRadio---->powerController");
	}
	
	public void soundController(){
		System.out.println("LGRadio---->soundController");
	}
	
	public void bandSelector(){
		System.out.println("LGRadio---->bandSelector");
	}
	
	public void channelSelector(){
		System.out.println("LGRadio---->channelSelector");
	}
}

class PanasonicRadio implements Radio{
	public void powerController(){
		System.out.println("PanasonicRadio---->powerController");
	}
	
	public void soundController(){
		System.out.println("PanasonicRadio---->soundController");
	}
	
	public void bandSelector(){
		System.out.println("PanasonicRadio---->bandSelector");
	}
	
	public void channelSelector(){
		System.out.println("PanasonicRadio---->channelSelector");
	}
}

class SamsungRadio implements Radio{
	public void powerController(){
		System.out.println("SamsungRadio---->powerController");
	}
	
	public void soundController(){
		System.out.println("SamsungRadio---->soundController");
	}
	
	public void bandSelector(){
		System.out.println("SamsungRadio---->bandSelector");
	}
	
	public void channelSelector(){
		System.out.println("SamsungRadio---->channelSelector");
	}
}

class H{
	public static void main(String[] args){
		Radio radio1 = new PanasonicRadio();
		radio1.soundController();
		
		
		Radio radio2 = new LGRadio();
		radio2.bandSelector();		
		
		Radio radio3 = new SamsungRadio();
		radio3.powerController();
	}
}
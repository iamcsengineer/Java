class X{
	static{ System.out.println("----- W");	}
	{ System.out.println("----- E");	}
	static{ System.out.println("----- T");	}
	{ System.out.println("----- C");  }
}

class J extends X{
	{ System.out.println("----- O"); }
	static{ System.out.println("----- S"); }
	public static void main(String[] args){
		System.out.println("----- main start");
		J j = new J();
		System.out.println("----- main end");
	}
}
class A{ }
class B{ }
class C{ }

//interface E{ }
interface F{ }
interface G{ }

//Case 8:
/*
interface E implements F,G{ 

}*/

//Case 7:
/*
interface E implements F{ 

}*/

//Case 6:
/*
interface E implements A,B{ 

}*/


//Case 5:
/*
interface E implements A{ 

}*/

//Case 4:
/*
interface E extends F,G{ 

}*/

//Case 3:
/*
interface E extends F{ 
	
}*/

//Case 2:
/*
interface E extends A,B{ 

}*/

//Case 1:
/*
interface E extends A{ 

}*/

class Human{

}

interface Intelligent{

}

interface Smart{

}

//Case 4:
/*
class American extends Human{

}*/


//Case 3:
/*
class American implements Intelligent,Smart{
	
}*/


//Case 2: NOT OK
/*
class American implements Intelligent,Smart extends Human{
	
}*/

//Case 1:
/*
class American extends Human implements Intelligent,Smart{
	
}*/
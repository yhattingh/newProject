package oopRevised;

public class PracStaticPublicMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
						
		PracStaticPublicMain.myStaticHello9(); // static void method can be called without creating objects
		PracStaticPublicMain.myStaticMethodGoodBye9();
			
		// create an object of the method
		PracStaticPublicMain myStaticPublicMain = new PracStaticPublicMain(); //instantiate StaticPublic object
		
		//call the public method of the object
		myStaticPublicMain.myPublicMethod9(); //myStaticPublic = instantiated object and myPublicMethod = the method of the StaticPublic class

	}

}

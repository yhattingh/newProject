package oopRevised;

public class PracStaticPublic {
	//create a method
	static void myStaticHello() {
		System.out.println("Hello...");
	}
	
	static void myStaticMethodGoodBye() {
		System.out.println("Good bye..");
	}
	
	//create a public method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// call the static method
		
		myStaticHello(); // static void method can be called without creating objects
		myStaticMethodGoodBye();
		
		// create an object of the method
		PracStaticPublic myStaticPublic = new PracStaticPublic(); //instantiate StaticPublic object
		//call the public method of the object
		myStaticPublic.myPublicMethod(); //myStaticPublic = instantiated object and myPublicMethod = the method of the StaticPublic class

	}

}

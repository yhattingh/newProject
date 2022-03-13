package oopCarsRevise;

import oopCars.CarAttributes;

public class CarMethodsExcercise {

	//here we are creating a static method (static void method)
	//this means that it can be accessed without creating an object of the class
	//cannot call it by creating an instance
	static void myStaticVoidCarMethod() {
		System.out.println("my car does a lot of things = static void");

	}
	
	//unlike public, which can only be accessed by objects (public void method - can only access them via a )
	//must create a new instance to use it
	public void myPublicVoidCarSpeeds() {
		System.out.println("My car speeds - public void");
	}
	
	//use a main method to use the static void created above
	public static void main(String[] args) {
		myStaticVoidCarMethod();

	
	
		//create a new instance to use the public void above
		CarMethodsExcercise carMethods = new CarMethodsExcercise();
		carMethods.myPublicVoidCarSpeeds();
	
	}

}

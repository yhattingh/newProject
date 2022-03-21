package oopRevised;

public class MyPublicVoid {
	
	//create a public method
	public void myPublicMethod() {
		System.out.println("Public methods must be called by creating objects....");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyPublicVoid myPublicVoid = new MyPublicVoid(); //create an object of the class
		
		//call the public method of the object
		myPublicVoid.myPublicMethod(); //myStaticPublic = instantiated object and myPublicMethod = the method of the StaticPublic class

	}

}

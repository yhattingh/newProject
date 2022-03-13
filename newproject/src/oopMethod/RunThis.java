package oopMethod;

public class RunThis {
	
	//here we are creating a static method (static void method)
	//this means that it can be accessed without creating an object of the class
	static void myMethod() {
		System.out.println("hello World");
	}
	
	//unlike public, which can only be accessed by objects (public void method)
	public void myPublicMethod() {
		System.out.println("Public method must be called by creating objects");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an instance of our class
		myMethod();
		
		RunThis rt = new RunThis();
		rt.myPublicMethod();
	
	}
	
}

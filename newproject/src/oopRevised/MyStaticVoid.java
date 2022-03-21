package oopRevised;

public class MyStaticVoid {
	
	//create a static method
	static void myStaticMethod1() {
		System.out.println("Static method can be called without creating objects...");
	}
	
	public static void main(String[] args) {
		
	//call the static method without instantiating the object
	myStaticMethod1(); // static void method can be called without creating objects
	
	}
	
}
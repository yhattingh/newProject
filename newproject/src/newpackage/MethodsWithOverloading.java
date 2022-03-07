package newpackage;

public class MethodsWithOverloading {
	
	static void demoingMethod(String firstName) {
	//code to be executed
	System.out.println(firstName + " is the first name");
	}
	
	//overloading = may have 2 methods with the same name, as long as they do not pass the same parameters
	static void demoingMethod() {
	//code to be executed
	System.out.println("This is example for overloading - this method does not have parameters");
	}
	
	static void demoingMethod(String firstName, int iAge) {
	//code to be executed
	System.out.println(firstName + " is the first name" + " " + "and the age = " + iAge);
	}
	
	static void demoingMethod(String firstName, String friendName) {
	//code to be executed
	System.out.println(firstName + " is the first name" + " " + "and the friend = " + friendName);
	}
		
	public static void main(String[] args) {
		System.out.println("This is in the Main Method");
		demoingMethod("Precious");///calling and re-using the demoingMethod without re-writing it
		demoingMethod("Wessel", "Diana");
		demoingMethod("Diana", 21);
		demoingMethod();
		demoingMethod();


	}

}

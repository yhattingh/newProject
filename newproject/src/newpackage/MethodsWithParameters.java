package newpackage;

public class MethodsWithParameters {
	
	static void demoingMethodWithOneString(String firstName) {
	//code to be executed
	System.out.println(firstName + " is the first name");
	}
	
	//overloading = may have 2 methods with the same name, as long as they do not pass the same parameters
	static void demoingMethodWithZeroParams() {
	//code to be executed
	System.out.println("This method does not have parameters");
	}
	
	static void demoingMethodWithNameAndAge(String firstName, int iAge) {
	//code to be executed
	System.out.println(firstName + " is the first name" + " " + "and the age = " + iAge);
	}
	
	static void demoingMethodNameAndFriend(String firstName, String friendName) {
	//code to be executed
	System.out.println(firstName + " is the first name" + " " + "and the friend = " + friendName);
	}
	
	static int returnInt(int x) {
		System.out.println("this is inside the returnInt method" + "and param vlue for x = " + x);
		return 6;
	}
		
	public static void main(String[] args) {
		System.out.println("This is in the Main Method");
		demoingMethodWithOneString("Precious");///calling and re-using the demoingMethod without re-writing it
		demoingMethodNameAndFriend("Wessel", "Diana");
		demoingMethodWithNameAndAge("Diana", 21);
		demoingMethodWithZeroParams();
		demoingMethodWithZeroParams();
		System.out.println(returnInt(99));


	}

}

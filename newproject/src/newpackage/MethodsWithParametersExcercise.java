package newpackage;

public class MethodsWithParametersExcercise {
	
	static void demoingMethodWithThreeString(String firstName, String lastName, int iAge) {
	//code to be executed
	System.out.println("My name is " + firstName + " " + lastName + " and my age = " + iAge);
	}
	
	static int returnInt(int x) {
		System.out.println("this is inside the returnInt method" + "and param vlue for x = " + x);
		return 10*101;
	}
		
	public static void main(String[] args) {
		demoingMethodWithThreeString("Yolande","Hattingh", 200);
		demoingMethodWithThreeString("Yolande","Hattingh", returnInt(1));
		returnInt(99);
		int returnValue = returnInt(1);
		System.out.println(returnValue + " is the return value");


	}

}

package newpackage;

public class MethodsPractice {
	
	//methods created above the main method
	static void voidMethod() {
		System.out.println("this method does not return anything");
	}
	
	//this method returns an int value
	static int intMethod() {
		System.out.println("this method returns an int value of 4");
		return 4;
	}

	//This method returns an int value and expects 1 STring argument
	static int intStringMethod(String firstName) {
		System.out.println("this is the parameter value passed in " + firstName);
		return 55;
	}
	
	//This method returns a String and expects 2 string and 1 int arguments
	static String returnString(String param1, String param2, int x) {
		System.out.println("this is the return string method " + param1 + " " + param2 +  " " + x);
		return "Yolande's";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		voidMethod();
		intMethod();
		int returnValue = intStringMethod("Yolande");
		System.out.println("this is the return value from the intStringMethod " + returnValue);
		String returnValue2 = returnString("Yolande", "Hattingh", 22);
		System.out.println(returnValue2);

	}

}

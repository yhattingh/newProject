package newpackage;

public class MethodTwoParameters {
	
	//This method returns the sum of the method's 2 parameters
	static int myMethod(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int returnValue = myMethod(5, 8);
		System.out.println("The return value =  " + returnValue);
		System.out.println("The sum of x + y = " + myMethod(8, 5));

	}

}

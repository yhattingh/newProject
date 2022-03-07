package newpackage;

public class MethodIfElse {
	
	// it is common to use if .. else statement inside the method
	// create a checkAge() method with an integer variable called age
	
	static void checkAge(int age) {
		//if age is less than 18, then print "access denied"
		if (age < 18) {
			System.out.println("Access Denied - you are not old enough");
		} else {
			System.out.println("Access Granted");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(50);
		checkAge(17);
	
	}

}

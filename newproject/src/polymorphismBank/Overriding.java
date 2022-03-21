package polymorphismBank;

//Method overriding refers to a different implementation of a method in a subclass
//The method must have been already defined in the parent class
//Overriding method (i.e. the one in the subclass) must have the same method signature as that in the superclass
//The return type of the overriding method may be the same as or a subtype of the one in the superclass


public class Overriding {
	public void message() {
		System.out.println("Thank you for opening an account with us!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overriding myAccount = new Overriding();
		Savings mySavings = new Savings();
		FixedDeposit myFixedDeposit = new FixedDeposit();
		myAccount.message();
		mySavings.message();
		myFixedDeposit.message();
	}
	}	
	class Savings extends Overriding {
	public void message() {
	System.out.println("Thank you for opening a Savings account with us!");
	}
	}
	class FixedDeposit extends Overriding {
	public void message() {
	System.out.println("Thank you for opening a Fixed Deposit account with us!");
	}
}
	
	


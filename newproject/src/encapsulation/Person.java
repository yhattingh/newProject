package encapsulation;

//to make sure sensitive info is hidden from users
//declare variables and attributes as private
//use getters and setters to update the value of private variables
//private variables can only be accessed within the same class
//can only access the private variables if we provide public getter and setter methods
//get method returns the variable value
//set method sets the value

public class Person {
	
	// private = restricted access
	
	private String pName;
	
	// Getter
	//get method returns the value of the variable name
	public String getName() {
		return pName;
	}
		
	//Setter (this = from this class)
	//set method takes in a parameter newName and assigns it to the name variable
	public void setName(String newName) {
		this.pName = newName;
	}

}

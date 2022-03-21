package getterSetterEncapsulation;

public class Person {
	
	//declare class variables as private
	//private variables can only be accessed within the same class - an outside class has no access to it
	private String personName;
	
	//Getters and setters are under the umbrella of encapsulation where we do not display sensitive data
	
	//Getter - public so that we can access it
	//get methods returns the value of the variable name
	public String getName() {
		return personName;
	}
		
	//Setter - takes a parameter and assigns it to the variable name
	public void setName(String newName) {
		personName = newName;

	}

}

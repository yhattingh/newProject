package oopRevised;

public class Constructor {
	
	//create a class attribute
	int x;
	
//	create a class constructor of the class called Constructor
//	the constructor name is exactly the same as the class name and with caps
//	cannot have a return type like void, string, int etc.
//	constructor is called when the object is created
	public Constructor() {
		
		//set the initial value for the called attribute
		x = 5;
	}
	

	public static void main(String[] args) {
	
		//create an object of the class
		Constructor myConstructor = new Constructor();
		System.out.println(myConstructor.x);
		
		
	}

}

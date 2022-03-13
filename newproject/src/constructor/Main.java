package constructor; //a special method that is used to initialize objects

public class Main {
	//create a class attribute
	int x;
	
	//create a class constructor for the Main class - use the exact same name as the class name
	//Note:  the contructor name must match the class name,
	// and cannot have a return type (void String or int)
	//also not that the constructor is called when the object is created
	//all classes do in fact have a constructor by default:  if you don't create a class constructor, Java creates it for you
	//***however, then you are not able to  set initial values for the object attributes****
	public Main () { 
		//set the initial value for the class attribute x
		x = 5;
	}
		
	
	//note:  method is with a small m = main
	public static void main(String[]arg) { 
		//TODO Auto-generated method stub
		//create an object of class Main (This will call the constructor)
		Main myObj =  new Main();
		
		System.out.println(myObj.x);
		
	}
	
}
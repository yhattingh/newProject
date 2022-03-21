package oopRevised;

public class Attributes {
	
	int x; //declare variable
	int y = 66;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Attributes myAttr1 = new Attributes();
		System.out.println(myAttr1.y); //use declared variable value == 66
		
		//myAttr1 and myAttr2 = objects
		
		myAttr1.x = 55;  //set variable  == 55
		System.out.println(myAttr1.x);
		
		myAttr1.y = 68; //modify variable == 68
		System.out.println(myAttr1.y);
		
		Attributes myAttr2 = new Attributes();
		myAttr2.x = 77;
		System.out.println(myAttr2.x);
		System.out.println(myAttr1.x);
		

	}

}

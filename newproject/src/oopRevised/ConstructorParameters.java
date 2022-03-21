package oopRevised;

public class ConstructorParameters {
	
	//variable
	int x;
	
	//create constructor with exactly the same name as the Class name
	public ConstructorParameters(int y) {
		x = y;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorParameters myConstructorParameters = new ConstructorParameters(67); //67 == this is the difference between default and created constructor == we can set an initial value
		System.out.println(myConstructorParameters.x);
		
	}

}

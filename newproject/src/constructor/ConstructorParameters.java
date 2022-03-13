package constructor;

public class ConstructorParameters {
	int x;
	String constructorName;
	
	//create a constructor
	public ConstructorParameters(int y, String myName ) {
		x = y;
		constructorName = myName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorParameters myObject = new ConstructorParameters(6,"Yolande");
		System.out.println(myObject.x + " " + myObject.constructorName);

	}

}

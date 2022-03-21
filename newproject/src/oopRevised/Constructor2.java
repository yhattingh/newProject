package oopRevised;

public class Constructor2 {
	
	int modelYear;
	String modelName;
	
	//create a constructor
	public Constructor2(int year1, String name1) {
		modelYear = year1;
		modelName = name1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor2 constructor2 = new Constructor2(1960, "Chevvy");
		System.out.println("Model year: " + constructor2.modelYear + "  Model Name: " + constructor2.modelName);
		
		// we do not pass variable to classes, but to the class constructor
	}
}

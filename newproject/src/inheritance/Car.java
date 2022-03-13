package inheritance;

public class Car extends Vehicle {
	
	private String brand = "Ford";
	private String modelName = "Mustang";
	private String modelName2 = "Ranger";
	
	public static void main(String[] args) {
		// create an object of the car class
		
		Car myCar = new Car();
		
		//call the honk method from the vehicle class on the myCar object
		myCar.honk();
		
		//display the attribute values
		//brand is from vehicle and modelName is from Car class (this class)
		//Note, we only made an instance from this class and not from the vehicle class
		System.out.println(myCar.brand + " " + myCar.modelName + " " + myCar.modelName2);
		
		
	}

}

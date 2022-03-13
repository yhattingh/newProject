package inheritance;

public class Car2 extends Vehicle{
	
	private String hoot = "toots";
	private int numberOfWheels = 4;
	private boolean powerSteering = true;

	public static void main(String[] args) {
		
		Car2 myCar1 = new Car2();
		
		myCar1.brand = "Ford";
		myCar1.name = "Mustang";
		myCar1.model = "2020";
		myCar1.cost = 300000;
				
		System.out.println(
				"Brand = " + myCar1.brand + "; " + " " + 
				"Name = " + myCar1.name + "; " + 
				"Model = " + myCar1.model + "; " + 
				"Cost = R " + myCar1.cost + "; " + 
				"Number of Wheels = " + myCar1.numberOfWheels + "; " +
				"Has powersteering = " + myCar1.powerSteering + "; " +
				"Hoot sounds like = " + myCar1.hoot);
		
		Car2 myCar2 = new Car2();
		
		myCar2.brand = "Ford";
		myCar2.name = "Ranger";
		myCar2.model = "2021";
		myCar2.cost = 200000;
		
		
		System.out.println(
				"Brand = " + myCar2.brand + "; " + " " + 
				"Name = " + myCar2.name + "; " + 
				"Model = " + myCar2.model + "; " + 
				"Cost = R " + myCar2.cost + "; " + 
				"Number of Wheels = " + myCar2.numberOfWheels + "; " +
				"Has powersteering = " + myCar2.powerSteering + "; " +
				"Hoot sounds like = " + myCar2.hoot);
		

	}

}

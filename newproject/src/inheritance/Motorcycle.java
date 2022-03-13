package inheritance;

public class Motorcycle extends Vehicle {
	
	private String hoot = "toot";
	private int numberOfWheels = 2;
	private boolean powerSteering = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Motorcycle myMotorcycle1 = new Motorcycle();
			Motorcycle myMotorcycle2 = new Motorcycle();
			
			myMotorcycle1.brand = "BMW";
			myMotorcycle1.name = "BMW classic";
			myMotorcycle1.model = "2020";
			myMotorcycle1.cost = 300000;
			myMotorcycle1.numberOfWheels = 2;
			myMotorcycle1.powerSteering = false;
			myMotorcycle1.hoot = "toots";
			
			System.out.println(
					"Brand = " + myMotorcycle1.brand + "; " + " " + 
					"Name = " + myMotorcycle1.name + "; " + 
					"Model = " + myMotorcycle1.model + "; " + 
					"Cost = R " + myMotorcycle1.cost + "; " + 
					"Number of Wheels = " + myMotorcycle1.numberOfWheels + "; " +
					"Has powersteering = " + myMotorcycle1.powerSteering + "; " +
					"Hoot sounds like = " + myMotorcycle1.hoot);
			
			myMotorcycle2.brand = "Ducati";
			myMotorcycle2.name = "Panigale V4S";
			myMotorcycle2.model = "2022";
			myMotorcycle2.cost = 600000;
			myMotorcycle2.numberOfWheels = 2;
			myMotorcycle2.powerSteering = false;
			myMotorcycle2.hoot = "hoots";
			
			System.out.println(
					"Brand = " + myMotorcycle2.brand + "; " + " " + 
					"Name = " + myMotorcycle2.name + "; " + 
					"Model = " + myMotorcycle2.model + "; " + 
					"Cost = R " + myMotorcycle2.cost + "; " + 
					"Number of Wheels = " + myMotorcycle2.numberOfWheels + "; " +
					"Has powersteering = " + myMotorcycle2.powerSteering + "; " +
					"Hoot sounds like = " + myMotorcycle2.hoot);


	}

}

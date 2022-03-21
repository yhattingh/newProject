package oopRevised;

public class InheritCar extends InheritVehicle{
	String modelName = "Mustang"; //object variable
	String color = "red";
	int year = 1980;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an object of the class and not from the extended class
		InheritCar myInheritCar = new InheritCar();
		
		//call the honk method from the InheritVehicle class
		myInheritCar.honk();
				
		// print attributes brand from extended InheritVehicle class and modelName from InheritCar class
		System.out.println(myInheritCar.brand + " " + myInheritCar.modelName + " " + myInheritCar.color + " " + myInheritCar.year + " " + myInheritCar.wheels);
		
	}

}

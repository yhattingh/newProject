package oopCarsRevise;

public class CarInstances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create 3 instances of the main object with various attributes
		CarAttributes merc = new CarAttributes();
		merc.colour = "red";
		merc.make = "Mercedes";
		merc.year = 2021;
		merc.action = "drives off";
		
		CarAttributes bmw = new CarAttributes();
		bmw.colour = "blue";
		bmw.make = "BMW";
		bmw.year = 2020;
		bmw.action = "speeds off";
		
		CarAttributes vw = new CarAttributes();
		vw.colour = "red";
		vw.make = "VW Golf";
		vw.year = 2022;
		vw.action = "stops";
		
		System.out.println(" The " + vw.colour + " " + vw.make + " " + vw.year + " " + vw.action);
		
		System.out.println(" The " + bmw.colour + " " + bmw.make + " " + bmw.year + " " + bmw.action);
		
		System.out.println(" The " + merc.colour + " " + merc.make + " " + merc.year + " " + merc.action);
		
	}

}

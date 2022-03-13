package oopCarsRevise;

public class VW {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an instance of class VW
		CarAttributes vw = new CarAttributes();
		vw.colour = "red";
		vw.make = "vw Golf";
		vw.year = 2022;
		vw.action = "stops";
		
		System.out.println(" The " + vw.colour + " " + vw.make + " " + vw.year + " " + vw.action);
		
	}

}

package oopCarsRevise;

public class Mercedes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create new instance of the object
		CarAttributes merc = new CarAttributes();
		merc.colour = "red";
		merc.make = "Mercedes";
		merc.year = 2021;
		merc.action = "drives off";
		
		System.out.println(" The " + merc.colour + " " + merc.make + " " + merc.year + " " + merc.action);
		
	}

}

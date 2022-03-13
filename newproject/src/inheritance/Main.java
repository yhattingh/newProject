package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car2 mustang = new Car2();
		mustang.name = "Mustang";
		
		Car2 ranger = new Car2();
		ranger.name = "Ranger";
		
		System.out.println("The Car names are " + ranger.name + " and " + mustang.name);
		
		Motorcycle BMW = new Motorcycle();
		BMW.name = "BMW";
		BMW.model = "BMW classic";
		
		Motorcycle Ducati = new Motorcycle();
		Ducati.name = "Ducati";
		Ducati.model = "Panigale V4S";
		
		System.out.println("The motorcycle names are " + Ducati.name + " and " + BMW.name);

	}

}

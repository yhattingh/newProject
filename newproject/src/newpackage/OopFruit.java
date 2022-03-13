package newpackage;

//class = object
public class OopFruit {
	
	int x = 5; //variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an instance of the Fruit class
		// Apple = capitol A because it is an instance of the class
		OopFruit Apple = new OopFruit();
		OopFruit Banana = new OopFruit();
		OopFruit Mango = new OopFruit();
		OopFruit Orange = new OopFruit();
		
		
		//print the value of x - creating instances of oopDemo
		System.out.println(Apple.x);
		System.out.println(Banana.x);
		System.out.println(Mango.x);
		System.out.println(Orange.x);
	}

}

package polymorphismBank;

//Method overloading and overriding are the two ways in which Java demonstrates polymorphism
//"Method overloading" refers to defining different methods in a class with the same name
//The methods must have different signatures
//A method signature is the combination of a method's name and parameter list.  It does not include the return type

public class Overloading {
	
	public int cube(int x) {
		return x*x*x;
	}
	
	public double cube(double x) {
		return x*x*x;
	}
	
	public float cube(float x) {
		return x*x*x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading myOverloading = new Overloading();
		System.out.println("The (int) cube of 5 is " + myOverloading.cube(5));
		System.out.println("The (double) cube of 5 is " + myOverloading.cube(5.0));
		System.out.println("The (float) cube of 5 is " + myOverloading.cube(0.5));
	}

}

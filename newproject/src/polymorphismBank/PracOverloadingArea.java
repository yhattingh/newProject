package polymorphismBank;

public class PracOverloadingArea {
	
	public int area(int x) {
		return x*x;
	}
	
	public double area(double x) {
		return x*x*x;
	}
	
	public float area(float x) {
		return x*x*x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracOverloadingArea myOverloading = new PracOverloadingArea();
		
		System.out.println("The (int) shape of circle is " + myOverloading.area(5));
		System.out.println("The (double) triangle of 5 is " + myOverloading.area(5.0));
		System.out.println("The (float) rectangle of 5 is " + myOverloading.area(0.5));
	}

}
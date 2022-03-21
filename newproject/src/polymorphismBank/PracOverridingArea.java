package polymorphismBank;

public class PracOverridingArea {
	
	public void shape() {
		System.out.println("The shape is to be determined");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PracOverridingArea myShape = new PracOverridingArea();
		
		Circle myCirlce = new Circle();
		Triangle myTriangle = new Triangle();
		Rectangle myRectangle = new Rectangle();
		
		myCirlce.shape();
		myTriangle.shape();
		myRectangle.shape();
	}
	}	
	class Circle extends PracOverridingArea {
	public void shape() {
	System.out.println("The shape is round..");
	}
	}
	class Triangle extends PracOverridingArea {
	public void shape() {
	System.out.println("The shape is triangle.. ");
	}
	}
	class Rectangle extends PracOverridingArea {
	public void shape() {
	System.out.println("The shape is rectangle..");
	}
}
	
	
package encapsulation;

public class WorkingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person myObj = new Person();
		
		//Set the value of the name value to Yolande
		myObj.setName("Yolande");
		
		System.out.println(myObj.getName());
		
	}

}


//Summary:
//Why do we need encapsulation
//Better control of class attributes and methods
//Increased security of data
//Class attributes can be make read-only
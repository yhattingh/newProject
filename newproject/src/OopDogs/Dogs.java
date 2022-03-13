package OopDogs;

public class Dogs {
	
	//will not run without a main method
	static void introduction() {
		System.out.println("Introduction note:  Find a dog");
	}
	
	//will not run without a main method
	static void enquiries() {
		System.out.println("Phone 0800 900 900 for enquiries");
	}
	
	public static void main(String[] args) {
		DogAttributes dog1 = new DogAttributes();
		dog1.name = "Spencie";
		dog1.age = 12;
		dog1.breed = "Toy Poodle";
		dog1.sex = "male";
		
		DogAttributes dog2 = new DogAttributes();
		dog2.name = "Milo";
		dog2.age = 13;
		dog2.breed = "Worsie";
		dog2.sex = "female";
		
		introduction(); //static void does not need a main method
		enquiries(); //static void does not need a main method
		
		//needs a main method
		System.out.println("My first dog's name is " + " " + dog1.name + " he is " + dog1.age + " years old" + " and he is a " + dog1.sex + " " + dog1.breed);
		System.out.println("My second dog's name is " + " " + dog2.name + " he is " + dog2.age + " years old" + " and he is a " + dog2.sex + " " + dog2.breed);
		
		
		
		
		
	}

}

import java.util.ArrayList;


public class AnimalRunner {

	public static void main(String[] args) {
	
		/* Question 1.1
		 * Uncomment this portion to see code function. To answer the question:
		 * Yes, this works. As it is an array of speakable objects, and since both cat and dog 
		 * implement speakable, the cat and dog can both be added.
		 * Also, since both cat and dog have the speak() method, 
		 * the speakable object myAnimal can call the speak method, and it works.
		ArrayList<Speakable> catDogList = new ArrayList<Speakable>();
		Dog fred = new Dog("Fred");
		Cat george = new Cat("George");
		catDogList.add(fred);
		catDogList.add(george);
		for(Speakable myAnimal : catDogList){
			myAnimal.speak();
		}*/ 
		
		Dog d1 = new Dog("Fred");
	    d1.speak();
	    Object obj = new Dog("Connie");
	    Dog d2 = (Dog) obj;
	    d2.speak(); //this works because while obj cannot call dog methods,
	    //casting obj to a Dog allows it to use the dog methods
	    
	    Cat myCat = new Cat("Will");
	    Dog myDog = (Dog) myCat;
	}

}

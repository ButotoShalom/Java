package oops;

public class AnimalPlay {
	public static void main(String[] args) {
		Animal sparky = new Dog();
		Animal tweeyy = new Birds();
		
		System.out.println("Dog" + sparky.gettTryToFly());
		
		System.out.println("birds" + tweeyy.gettTryToFly());
		sparky.setTryToFly(new ItFlys());
		System.out.println("Dog" + sparky.gettTryToFly());
	}
} 

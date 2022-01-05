package oops;

public class Dog extends Animal{

	
	public Dog() {
		super();
		setWeight(-1);
		setName("Bizobagaruka");
		setSound("Baaaa");
		flyingType = new CantFLy();
	}
	
	
	
	
	
	public void digHole() {
		System.out.println("The dog is digginf");
	}
	
	public void changeVar(int randNum) {
		randNum = 12;
		System.out.println("Rand oin method" + randNum);
	}
	
	
	private void privatate() {
	System.out.println("The dog private method");
	}
	

	public void publicable() {
		privatate();
	System.out.println("The dog public method");
	}
}

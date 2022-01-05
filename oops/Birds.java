package oops;

public class Birds extends Animal{
	
	public Birds() {
		super();
		setSound("Tweeet");
		flyingType = new ItFlys();
		
	}
}

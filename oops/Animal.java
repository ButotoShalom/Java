package oops;

public class Animal {
	
	private String name;
	private int weight;
	private double height;
	private String Sound;
	
	
	public Flys flyingType;
	
	public void setName(String newName) {name = newName;}
	public String getName() {return name;}
	
	public void setWeight(int newWeight) {
		if(weight > 0) {
			weight = newWeight;
		} 
		else {
			System.out.println("The weight must be bigger than 0");
		}
	}
	public int getWeight() {return weight;}
	
	public void setSound(String newSound) { Sound = newSound;}
	public String getSound() {return Sound;}
	
	public void setHeight(double newHeight) {
		height = newHeight;
	}

	public double getHeight() {
		return height;
	}
	
	
	
	public void setTryToFly(Flys newFlyType) {
		flyingType = newFlyType;
	}
	public String gettTryToFly() {
		return flyingType.flys();
	}
	
}












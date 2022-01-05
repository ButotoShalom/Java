package oops;

public interface Flys {
	String flys();
}


class ItFlys implements Flys {

	
	public String flys() {
		
		return "Flys High";
	}
	
}

class CantFLy implements Flys{

	
	public String flys() {
		
		return "I can't Fly";
	}
	
}

package oops;

public class Main {
	int justNun = 10;
	
	public static void main(String[] args) {
	
		Dog fido = new Dog();
		System.out.println(fido.getName());
		System.out.println(fido.getWeight());
		fido.digHole();
		
		Cat pusi = new Cat();
//		System.out.println(pusi.getHeight());
		System.out.println(pusi.getName());
		System.out.println("====================");
		Giraffe g = new Giraffe();
		g.setName("NyaGiraffe");
		System.out.println(g.getName());
		System.out.println("====================");
		
		
		
		
		
		int randNum = 10;
		
		fido.changeVar(randNum);
		System.out.println("rand in class" + randNum);
		
		
		
//		changeObjectName(fido);
//		System.out.println("The name of dog after changing it " + fido.getName());
//		 
//		System.out.println(ChangeNameOfObject(pusi.getName()));
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy says: " + doggy.getSound());
		System.out.println("kitty says: " + kitty.getSound());
		
		Animal[] animals = new Animal[2];
		animals[0] = doggy;
		animals[1] = kitty;
		
		System.out.println("-----------------");
		
		System.out.println("doggy in arrays  "+animals[0].getSound());
		System.out.println("kitty in arrays  "+ animals[1].getSound());
		
		System.out.println("-----------------");
		
		
		speakAnimal (kitty);
		 
		((Cat)kitty).agapusi();
		System.out.println("UrUSAKUiuuuuu " + pusi.getName());	
		fido.publicable();
		
		
//		ChangeNameOfObject(pusi);
//		System.out.println("UrUSAKU" + pusi.getName());
	}
	
	public static void speakAnimal(Animal an) {
		System.out.println(an.getSound());
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
	
	
	
//	
//	
//	
//	public static void changeObjectName(Dog fido) {
//		fido.setName("Makasi");
//	}
//	
//	public static void ChangeNameOfObject(Cat cat) {
//		cat.setName("nyagapusi");
//	}

}

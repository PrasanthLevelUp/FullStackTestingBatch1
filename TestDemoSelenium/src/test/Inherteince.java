package test;

public class Inherteince extends Polymorphism{

	public static void main(String[] args) {
		Inherteince obj = new Inherteince();
		obj.add();
	}
	
	
	public void add() {
		super.add();
		System.out.println("Child");
		
	}

}

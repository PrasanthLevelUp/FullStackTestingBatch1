package test;

public class  Polymorphism extends Arrayes{

	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism();
		
		obj.add(5, 5);
		obj.add('c');
			
	}
	
	public void add() {
		System.out.println("Parnet");
		super.add();
	}
	
	public void add(int a) {
		
	}
	
	public void add(char b) {
		
	}
	
	public void add(int a, int b) {
		
	}

}

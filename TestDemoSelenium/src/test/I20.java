package test;

public class I20 {
	static int a;

	public static void main(String[] args) {
		Car obj = new Car();
		obj.start();

		Car obj2 = new Car();
		obj2.start();

		I20 obj3 = new I20();
		System.out.println(10);
		System.out.println(obj3.add());
		String result = obj3.name();
		obj3.show(result);
	}

	public int add() {
		a = 5 + 5;
		return a;
	}
	
	public void show(String str) {
		System.out.println(str);
	}
	
	public boolean isvisivle() {
		
		return true;
	}
	
	public String name() {
		String str = "Dwasrash";
		return str;
	}

}

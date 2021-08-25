package test;

public class DumyClass extends AbstractDemo implements Test,Test1{
	
	public DumyClass(int a,String str) {
		super(a,str);
		
	}

	public static void main(String[] args) {
		DumyClass obj = new DumyClass(5,"sifhif");
	}
	public void minimunbalance() {
		
	}

	public void homealone() {
		
	}

	@Override
	public void sub() {
		
		
	}

	@Override
	public void sub1() {
	
		
	}

	@Override
	public void sub2() {
		
	}

	@Override
	public void sub3() {
		// TODO Auto-generated method stub
		
	}


	public void sub4() {
		// TODO Auto-generated method stub
		
	}

	public void sub5() {
	
		Test.super.sub5();
	}

}

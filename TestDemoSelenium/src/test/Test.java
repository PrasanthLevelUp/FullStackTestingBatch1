package test;

public interface Test {
	public void sub();
	public void sub1();
	public void sub2();
	public void sub3();
	public void sub4();
	default void sub5() {
		System.out.println("5");
	}
}

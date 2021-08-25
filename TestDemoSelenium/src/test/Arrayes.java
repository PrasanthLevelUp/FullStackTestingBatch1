package test;

public class Arrayes {

	public static void main(String[] args) {
		//1D
		System.out.println(I20.a);
		int[] a = new int[20];
		
		a[0] = 10;
		a[2]=200;
		System.out.println(a[19]);
		
		System.out.println(a.length);
		
		String[] str = {"ytytt","vugvuy","cytcytvt"};
		
		System.out.println(str[0]);
		str[0]="sgsdrdg";
		System.out.println(str[0]+str[1]);
		
		String hobbies = "cricket,footble";
		String hobbies1 = "cricket,footble,tennis";
		String[] str1 = hobbies1.split(",");
		
		for(String st:str1) { //foreach loop, enhacned forloop
			System.out.println(st);
		}
		
		//2D dimnsion
		
		int[][] numbers = new int[2][3];
		
		numbers[0][0]=10;
		
		System.out.println(numbers.length);
		for(int i =0;i<numbers.length;i++) {
			for(int j=0;j<numbers[0].length;j++) {
				System.out.println(numbers[i][j]);
			}
		}
	
	}
	
	public void add() {
		System.out.println("Grand Parent");
	}

}

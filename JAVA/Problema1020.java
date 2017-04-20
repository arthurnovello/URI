import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int ida = scn.nextInt();
		int x = 30;
		int y = 365; 
		
		int a = ida / y;
		int n = ida % y;
		int m = n / x;
		int d = n % x;
		
		System.out.println( a + " ano(s)");
		System.out.println( m + " mes(es)");
		System.out.println( d + " dia(s)");
	
	}

}

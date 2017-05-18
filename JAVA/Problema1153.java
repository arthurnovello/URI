import java.util.Scanner;

public class Main {

	public static int fact(int n)
	{
	    return n == 1 ? 1 : n * fact(n - 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		System.out.println(fact(x));
		scn.close();
	}

}

package problema1007;
import java.util.Scanner;

public class Problema1007 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();
		int n3 = scn.nextInt();
		int n4 = scn.nextInt();
		
		System.out.println("DIFERENCA = "+((n1*n2)-(n3*n4)));
		scn.close();
	}

}

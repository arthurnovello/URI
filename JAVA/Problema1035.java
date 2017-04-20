import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int A = scn.nextInt();
		int B = scn.nextInt();
		int C = scn.nextInt();
		int D = scn.nextInt();
		
		if(B > C && D>A && (C+D) > (A+B) && C > 0 && B > 0 && A%2 == 0 ){
			
				System.out.println("Valores aceitos");
		}
		else{	
				System.out.println("Valores nao aceitos");
		} 
	
}
}

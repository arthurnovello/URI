import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double A, B, C, R1, R2, del;
		Scanner scn = new Scanner(System.in);
		
		A = scn.nextDouble();
		B = scn.nextDouble();
		C = scn.nextDouble();
		
		del = Math.pow(B, 2) - (4*A*C);
		if(del<=0 || 2*A == 0){
			System.out.println("Impossivel calcular");
			
		}else{
			R1 = (-B+Math.sqrt(del))/(2*A);
			System.out.printf("R1 = %.5f\n" , R1);
			R2 = (-B-Math.sqrt(del))/(2*A);
			System.out.printf("R2 = %.5f\n" , R2);
		}
		scn.close();

	}

}

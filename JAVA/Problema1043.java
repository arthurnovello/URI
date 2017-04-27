import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		double A = scn.nextDouble();
		double B = scn.nextDouble();
		double C = scn.nextDouble();
		
		if( A < B+C && B < A+C && C < B+A){
			
			System.out.printf("Perimetro = %.1f\n" , A+B+C);
		}
		
		else {
			double area = ((A + B)*C)/2;
			System.out.printf("Area = %.1f\n", area);
		}
	
		scn.close();
		
	}

}

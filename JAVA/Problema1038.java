import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int X = scn.nextInt();
		int Y = scn.nextInt();
		double prc = 0;
		
		switch(X){
		case 1:
			prc = Y*4;
			break;
		case 2:
			prc = Y*4.5;
			break;
		case 3:
			prc = Y*5;
			break;
		case 4:
			prc = Y*2;
			break;
		case 5:
			prc = Y*1.5;
			break;
		}
		System.out.printf("Total: R$ %.2f\n" , prc);
	}

}

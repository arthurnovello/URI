import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		double val = scn.nextFloat();
		double tx = 0;
		double temp1 = 0, temp2 = 0, temp3 = 0;
		
		if(val>0 && val<=2000){
			System.out.println("Isento");		
		} else {
			if(val>2000 && val<=3000){
				tx = (val - 2000)*0.08;
			} 
			if(val>3000 && val<=4500){
				   temp1 = val - 2000;
	               temp2 = temp1 - 1000;
	               temp1 -= temp2;
	               temp1 = ((temp1 * 8) / 100);
	               temp2 = ((temp2 * 18) / 100);
	               tx = temp2 + temp1;
			}  
			if(val>4500){
				   temp1 = val - 2000;
	               temp2 = temp1 - 1000;
	               temp3 = temp2 - 1500;
	               temp1 -= temp2;
	               temp2 -= temp3;
	               temp1 = ((temp1 * 8) / 100);
	               temp2 = ((temp2 * 18) / 100);
	               temp3 = ((temp3 * 28) / 100);
	               tx = temp3 + temp2 + temp1;
			}
			System.out.printf("R$ %.2f\n", tx);
		}
		
		
		scn.close();
	}

}

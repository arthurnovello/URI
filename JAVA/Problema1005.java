package problema1005;
import java.util.Scanner;


public class Problema1005 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		float n1 = scn.nextFloat();
		float n2 = scn.nextFloat();
		
		float  med = (float) (((3.5*n1)+(7.5*n2))/11.0);
		String media = String.format("%,.5f", med);
		System.out.println("MEDIA = "+media);
		scn.close();

	}

}

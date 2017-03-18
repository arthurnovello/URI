package problema1006;
import java.util.Scanner;


public class Problema1006 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		float n1 = scn.nextFloat();
		float n2 = scn.nextFloat();
		float n3 = scn.nextFloat();
		
		float  med = (float) (((n1*2)+(n2*3)+(n3*5))/10);
		String media = String.format("%,.1f", med);
		System.out.println("MEDIA = "+media);
		scn.close();

	}

}

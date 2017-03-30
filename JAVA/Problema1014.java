import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
	public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         
         int x = scn.nextInt();
         double y = scn.nextDouble();
         
         double med = x/y;
         
         System.out.printf("%.3f km/l\n", med);

	}

}

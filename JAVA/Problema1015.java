import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner scn = new Scanner(System.in);
		
		double x1 = scn.nextDouble();
		double y1 = scn.nextDouble();
		double x2 = scn.nextDouble();
		double y2 = scn.nextDouble();
		
		double p1 = (x2-x1)*(x2-x1);
		double p2 = (y2-y1)*(y2-y1);
		
		double dist = Math.sqrt(p1 + p2);
		
		System.out.printf("%.4f\n", + dist);
    }
 
}

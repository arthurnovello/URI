import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner scn = new Scanner(System.in);
		
		int tempo = scn.nextInt();
		int vel = scn.nextInt();
		
		double comb = (tempo * vel)/12.0;
		
		System.out.printf("%.3f\n", comb);
	
    }
 
}

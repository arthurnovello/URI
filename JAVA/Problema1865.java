import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        int x = 0, N = 0;

		Scanner scn = new Scanner(System.in);
		
		N = scn.nextInt();
	
		for(x=0;x<N;x++){
			String nome = scn.next();
			int forca = scn.nextInt();	
			if(nome.equals("Thor")){
				System.out.println("Y");
				
			} else {
				System.out.println("N");
				
			}
			
		}
		scn.close();        
 
    }
 
}

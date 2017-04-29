import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		Locale.setDefault(Locale.US); 
		
		for(int i = 1; i<=x; i++){
			if(i%2==0){
				System.out.println(i+"^2 = "+(i*i));
			}
			
		}

		scn.close();
	}

}

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int l = scn.nextInt();
		int j=1;
		
		
		for(int i = 1; i<=l; i++){
			System.out.println((j)+" "+(j+1)+" "+(j+2)+" PUM");
			j=j+4;
		}
		
		scn.close();
	}

}

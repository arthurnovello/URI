import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		while(n!=0){
			for(int i = 1; i<=n; i++){
				System.out.print(i);
				if(i<n){
					System.out.print(" ");
				}else{
					System.out.println();
				}
			}
		n = scn.nextInt();
		}
		
		scn.close();

	}

}

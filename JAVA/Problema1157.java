import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		for(int i = 1; i<=n; i++){
			if(n%i==0){
				System.out.println(i);
			}
		}
		
		scn.close();

	}

}

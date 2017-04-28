import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int x;
		
		
		
		for(int i = 1; i<10000; i++){
			x = i;
			if ((x%n)==2){
				System.out.println(i);
			}
			
		}
		
		scn.close();
	}

}

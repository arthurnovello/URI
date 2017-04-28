import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int y = scn.nextInt();
		int x = 1;
		
		while(x<=y){
			System.out.println(x);
			x=x+2;
		}
		
		scn.close();
	}

}

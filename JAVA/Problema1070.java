import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int x = scn.nextInt();
		int i = 0;
		
		if(x%2==0){
			x++;
		}
		
		while(i<6){
			System.out.println(x);
			x=x+2;
			i++;
		}
		
		scn.close();
	}

}

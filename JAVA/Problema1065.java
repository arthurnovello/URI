import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int j=0;
		
		for(int i = 0; i<5; i++){
			float n = scn.nextFloat();
			if(n%2==0){
				j++;
			}
			
		}
		
		System.out.println(j +" valores pares");
		scn.close();
	}

}

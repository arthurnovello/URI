import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int j=0;
		float soma = 0;
		float med = 0;
		
		for(int i = 0; i<6; i++){
			float n = scn.nextFloat();
			if(n>0){
				j++;
				soma = soma + n;
			}
			
		}
		
		med = soma/j;
		
		System.out.println(j +" valores positivos");
		System.out.printf("%.1f\n", med);
		scn.close();
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int[] N= new int[20];
		int temp = 0;
		
		for (int i = 0; i<20; i++){
			N[i] = scn.nextInt();
		}

		for (int j=0, k=19; j<10; j++, k--){
			temp = N[j];
			N[j]=N[k];
			N[k]=temp;
		}
	
		for(int l = 0; l<20; l++){
			System.out.println("N["+l+"] = "+N[l]);
		}
		
		scn.close();

	}

}

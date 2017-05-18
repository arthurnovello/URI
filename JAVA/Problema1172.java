import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

		for(int i = 0; i<10; i++){
			N[i]=scn.nextInt();
		}
		
		for(int j = 0; j<10; j++){
			if(N[j]<=0){
				N[j]=1;
			}
		}
		
		for(int k = 0; k<10; k++){
			System.out.println("X["+k+"] = "+N[k]);
		}
		
		scn.close();

	}

}

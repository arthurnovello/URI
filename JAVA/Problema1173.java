import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N[]={0,0,0,0,0,0,0,0,0,0};
		int v = scn.nextInt();
		
		for(int i = 0; i<10; i++){
			N[i]=v;
			System.out.println("N["+i+"] = "+N[i]);
			v*=2;
		}
		
		scn.close();
	}

}

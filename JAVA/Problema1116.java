import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		for(int i = 0; i < n; i++){
			int x = scn.nextInt();
			int y = scn.nextInt();
			if(y==0){
				System.out.println("divisao impossivel");
			}else{
				double div = (double)(x)/(double)(y);
				System.out.println(div);
			}
		}
		scn.close();
	}

}

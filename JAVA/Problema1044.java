import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int A = scn.nextInt();
		int B = scn.nextInt();
		
		if ((B%A)==0 || (A%B==0)){
			System.out.println("Sao Multiplos");
		}else{
			System.out.println("Nao sao Multiplos");	
		}
		
		scn.close();
	}

}

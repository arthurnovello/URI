import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int A = scn.nextInt(), B = scn.nextInt();
        

        if (B <= A) {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", 24 - (A - B));
        } 
        else {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", B - A);
        }
        
        scn.close();
        
	}

}

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Scanner scn = new Scanner(System.in);
		while(i==0){
			int x = scn.nextInt();
			int y = scn.nextInt();
			if (x>y){
				System.out.println("Decrescente");
			}else if (x<y){
				System.out.println("Crescente");
			}else if(x==y){
				i=1;
			}
		}
		scn.close();
	}

}

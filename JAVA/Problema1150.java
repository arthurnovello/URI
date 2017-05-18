import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int a,b,c=0,x,z;
		x = scn.nextInt();
		
		do{
			z= scn.nextInt();
		}while(x>=z);
		
		for(a=x, b=0; b<z; a++){
			b+=a;
			c++;
		}

		System.out.println(c);
		scn.close();
	}

}

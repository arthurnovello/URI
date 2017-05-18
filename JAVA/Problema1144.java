import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a=0,c=0,d=0,e=0,f=0;
		a = scn.nextInt();
		
		for (int b = 1; b<=a; b++){
			c=b*b;
	        d=b*b*b;
	        System.out.printf("%d %d %d\n",b,c,d);
	        e=c+1;
	        f=d+1;
	        System.out.printf("%d %d %d\n",b,e,f);
		}
		
		scn.close();

	}

}

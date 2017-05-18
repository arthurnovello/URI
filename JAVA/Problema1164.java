import java.util.Scanner;

public class Main {      

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N, X, a, b, c, d=0;
	    N = scn.nextInt();
	    for(a=1; a<=N; a++)
	    {
	        X = scn.nextInt();
	        c=X/2; d=0;
	        for(b=1; b<=c; b++)
	        {
	            if(X%b==0)
	                d+=b;
	        }
	        if(d==X)
	            System.out.printf("%d eh perfeito\n",X);
	        else
	        	System.out.printf("%d nao eh perfeito\n",X);
	    }
	    scn.close();

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N, X, Y, a, b, c;
	    N = scn.nextInt();
	    for(a=1; a<=N; a++)
	    {
	        X = scn.nextInt();
	        Y = scn.nextInt();
	        if(X%2==1)
	        {
	            c=0;
	            for(b=1; b<=Y; b++)
	            {
	                c+=X;
	                X+=2;
	            }
	            System.out.printf("%d\n", c);
	        }
	        else
	        {
	            X++;
	            c=0;
	            for(b=1; b<=Y; b++)
	            {
	                c+=X;
	                X+=2;
	            }
	            System.out.printf("%d\n", c);
	        }
	    }
	    scn.close();
	}

}

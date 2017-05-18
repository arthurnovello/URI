import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x=1,a,b=0;
	    while(x!=0)
	    {
	        x = scn.nextInt();
	        b=0;
	        if(x==0)
	            break;
	        else if(x%2==0)
	        {
	            for(a=x; a<=x+8; a+=2) b+=a;
	        }
	        else
	        {
	            for(a=x+1;a<=x+9;a+=2) b+=a;
	        }
	        System.out.printf("%d\n", b);
	    }
	    scn.close();

	}

}

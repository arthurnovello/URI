import java.util.Scanner;

public class Main {
	
	 public static boolean isPrimeNumber(int i) {
	        int factors = 0;
	        int j = 1;

	        while(j <= i)
	        {
	            if(i % j == 0)
	            {
	                factors++;
	            }
	            j++;
	        }
	        return (factors == 2);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int x = scn.nextInt();
		
		for(int d = 0; d<x; d++){
			int i = scn.nextInt();
			if (isPrimeNumber(i))
	        {
	           System.out.println(i+" eh primo");
	        }else{
	        	System.out.println(i+" nao eh primo");
	        }
		}
		scn.close();
	}

}

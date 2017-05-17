import java.util.Scanner;

public class Main {

	public static int fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		
		for(int i = 0; i<x; i++){
			int y = fibonacci(i);
			System.out.print(y);
			if(i<x-1){
				System.out.print(" ");
			}else{
				System.out.println();
			}
			
		}
		
		
		scn.close();
	}
	
}

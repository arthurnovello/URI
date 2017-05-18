import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int X,Y,b=0;
		X = scn.nextInt();
		Y = scn.nextInt();
		
		for(int a = 1; a<=Y; a++){
			b++;
	        if(b==X){ 
	        	System.out.printf("%d",a);
	        }
	        else{ 
	        	System.out.printf("%d ", a);
	        }
	        if(b==X)
	        {
	            b=0;
	            System.out.printf("\n");
	        }
		}
		scn.close();
	}

}

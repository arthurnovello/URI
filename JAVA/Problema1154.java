import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		double id = 0.0;
		double i = 0.0;
		
		do{
			id+=(double)n;
			i++;
			n = scn.nextInt();
		}while(n>0);
		
		DecimalFormat df = new DecimalFormat("####.00");
		double res = id/i;
		
		System.out.println(df.format(res));
		scn.close();

	}

}

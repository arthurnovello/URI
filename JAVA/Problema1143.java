import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		DecimalFormat df = new DecimalFormat("###.#");
		
		for(int i = 1; i<=n; i++){
			System.out.println(df.format(Math.pow(i, 1))+" "+df.format(Math.pow(i, 2))+" "+df.format(Math.pow(i, 3)));
		}
		scn.close();
	}

}

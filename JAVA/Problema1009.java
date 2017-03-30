import java.io.IOException;
import java.util.Scanner; 
import java.text.DecimalFormat;
import java.util.Locale;


public class Main {
 
    public static void main(String[] args) throws IOException {
 
	    Locale.setDefault(Locale.US); 
	    DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner scn = new Scanner(System.in);
		String n1 = scn.nextLine();
		double n2 = Double.parseDouble(df.format(scn.nextDouble()));
		double n3 = Double.parseDouble(df.format(scn.nextDouble()));
		
		double n4 = (n2+0.15*n3);

		System.out.println("TOTAL = R$ "+df.format(n4));
		scn.close();
    }
 
}

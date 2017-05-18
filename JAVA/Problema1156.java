import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0;
		for(int i = 1; i<=100; i++){
			x+=1/(double)i;
		}
		DecimalFormat df = new DecimalFormat("####.00");
		
		System.out.println(df.format(x));
		
		

	}

}

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 1;
		double s = 0;
		for(int i = 1; i<=39; i+=2){
			s += i/x;
			x*=2;
		}
		DecimalFormat df = new DecimalFormat("######.00");
		
		System.out.println(df.format(s));
		
		

	}

}

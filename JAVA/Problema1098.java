import java.io.IOException;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double I =0, J=1;
		DecimalFormat df = new DecimalFormat("###.#");

		while(I<=2 && J<=5)
		{
		System.out.println("I="+df.format(I)+" J="+df.format(J));
		J++;
		System.out.println("I="+df.format(I)+" J="+df.format(J));
		J++;
		System.out.println("I="+df.format(I)+" J="+df.format(J));
		I=I + 0.2;
		J=1 + I;
		}

	}

}

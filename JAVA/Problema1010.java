import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

  
        Scanner scn = new Scanner(System.in);

        int cod1 = scn.nextInt();
        int uni1 = scn.nextInt();
        float pre1 = scn.nextFloat();

        int cod2 = scn.nextInt();
        int uni2 = scn.nextInt();
        float pre2 = scn.nextFloat();

        DecimalFormat df = new DecimalFormat("####.00");

        float res = (uni1 * pre1) + (uni2 * pre2);

        System.out.println("VALOR A PAGAR:" + " " + "R$" + " " + df.format(res));
    }
}
